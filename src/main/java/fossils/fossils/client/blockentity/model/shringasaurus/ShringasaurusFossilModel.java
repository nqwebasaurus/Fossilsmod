package fossils.fossils.client.blockentity.model.shringasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ShringasaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Body2;
	private final ModelPart backleftleg4;
	private final ModelPart backleftleg5;
	private final ModelPart backleftleg6;
	private final ModelPart backleftleg2;
	private final ModelPart backrightleg4;
	private final ModelPart backrightleg5;
	private final ModelPart backrightleg6;
	private final ModelPart backrightleg2;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart shoulder;
	private final ModelPart Neck;
	private final ModelPart frontleftleg4;
	private final ModelPart frontleftleg5;
	private final ModelPart frontleftleg6;
	private final ModelPart frontrightleg4;
	private final ModelPart frontrightleg5;
	private final ModelPart frontrightleg6;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Neck2;
	private final ModelPart neck4;
	private final ModelPart Neck3;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public ShringasaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Body2 = this.fossil.getChild("Body2");
		this.backleftleg4 = this.Body2.getChild("backleftleg4");
		this.backleftleg5 = this.backleftleg4.getChild("backleftleg5");
		this.backleftleg6 = this.backleftleg5.getChild("backleftleg6");
		this.backleftleg2 = this.backleftleg6.getChild("backleftleg2");
		this.backrightleg4 = this.Body2.getChild("backrightleg4");
		this.backrightleg5 = this.backrightleg4.getChild("backrightleg5");
		this.backrightleg6 = this.backrightleg5.getChild("backrightleg6");
		this.backrightleg2 = this.backrightleg6.getChild("backrightleg2");
		this.bone = this.Body2.getChild("bone");
		this.bone4 = this.Body2.getChild("bone4");
		this.Tail = this.Body2.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Body = this.Body2.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.shoulder = this.body4.getChild("shoulder");
		this.Neck = this.shoulder.getChild("Neck");
		this.frontleftleg4 = this.Neck.getChild("frontleftleg4");
		this.frontleftleg5 = this.frontleftleg4.getChild("frontleftleg5");
		this.frontleftleg6 = this.frontleftleg5.getChild("frontleftleg6");
		this.frontrightleg4 = this.Neck.getChild("frontrightleg4");
		this.frontrightleg5 = this.frontrightleg4.getChild("frontrightleg5");
		this.frontrightleg6 = this.frontrightleg5.getChild("frontrightleg6");
		this.bone2 = this.Neck.getChild("bone2");
		this.bone3 = this.Neck.getChild("bone3");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.neck4 = this.Neck2.getChild("neck4");
		this.Neck3 = this.neck4.getChild("Neck3");
		this.neck5 = this.Neck3.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.Head = this.neck7.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body2 = fossil.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.9659F, 8.6503F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 106).addBox(0.0F, -1.8329F, -0.057F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6378F, 7.0496F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(69, 102).addBox(0.0F, -2.3382F, -0.0061F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.576F, 4.9893F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(66, 102).addBox(0.0F, -2.7385F, 0.0009F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8156F, 2.9942F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(52, 102).addBox(0.0F, -3.0382F, -0.0061F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8551F, 0.9991F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-2.5F, -1.8771F, 15.0749F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 25).addBox(0.5F, -1.8771F, 15.0749F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(23, 9).addBox(-0.5F, -2.3771F, 14.0749F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.3264F, -14.2014F, -0.0698F, 0.0F, 0.0F));

		PartDefinition backleftleg4 = Body2.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0299F, 0.9363F, 1.4868F, 0.3054F, 0.3751F, -0.1053F));

		PartDefinition cube_r6 = backleftleg4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 100).addBox(-0.5F, -0.8F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0832F, 0.7828F, 0.9366F, 0.143F, -0.5193F, -0.4768F));

		PartDefinition cube_r7 = backleftleg4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(77, 21).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0065F)), PartPose.offsetAndRotation(1.3336F, 3.1621F, 0.9281F, 0.8411F, -0.5193F, -0.4768F));

		PartDefinition cube_r8 = backleftleg4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(83, 41).addBox(-0.5F, 0.2F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(1.3336F, 3.1621F, 0.9281F, -0.337F, -0.5193F, -0.4768F));

		PartDefinition cube_r9 = backleftleg4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(80, 98).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0336F, 2.6121F, 0.9281F, -0.5552F, -0.5193F, -0.4768F));

		PartDefinition cube_r10 = backleftleg4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(95, 61).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.0336F, 2.6121F, 0.9281F, 0.0993F, -0.5193F, -0.4768F));

		PartDefinition cube_r11 = backleftleg4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(106, 64).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0926F, -0.4093F, 0.2528F, -2.3354F, -0.5193F, -0.4768F));

		PartDefinition cube_r12 = backleftleg4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 106).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(-0.5978F, -0.3184F, 1.111F, -1.4191F, -0.5193F, -0.4768F));

		PartDefinition cube_r13 = backleftleg4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(55, 106).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.626F, 0.4392F, 1.7632F, -0.721F, -0.5193F, -0.4768F));

		PartDefinition cube_r14 = backleftleg4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(70, 83).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2845F, 1.3563F, 1.9687F, 0.239F, -0.5193F, -0.4768F));

		PartDefinition cube_r15 = backleftleg4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(83, 62).addBox(-0.05F, -0.6F, 1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(0.7836F, 0.9157F, -0.952F, -0.1625F, -0.5193F, -0.4768F));

		PartDefinition backleftleg5 = backleftleg4.addOrReplaceChild("backleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4575F, 5.9836F, 1.7127F, 0.6026F, -0.4724F, 0.2013F));

		PartDefinition cube_r16 = backleftleg5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(62, 93).addBox(-0.7F, 3.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(84, 9).addBox(-0.3F, -0.2F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.5257F, 4.58F, 1.3174F, 1.5521F, 1.4487F, 1.5958F));

		PartDefinition cube_r17 = backleftleg5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(7, 84).addBox(-0.3F, -0.2F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.5257F, 4.58F, 1.3174F, 1.5606F, 1.3439F, 1.6045F));

		PartDefinition cube_r18 = backleftleg5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(46, 93).addBox(-1.2F, -3.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 87).addBox(-0.2F, -2.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.6127F, 2.5805F, 1.3826F, 1.5593F, 1.3701F, 1.6031F));

		PartDefinition cube_r19 = backleftleg5.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 91).addBox(-0.2F, -2.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.6127F, 2.5805F, 1.3826F, -1.5056F, 1.5358F, -1.462F));

		PartDefinition cube_r20 = backleftleg5.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(90, 61).addBox(-0.2F, -2.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.6127F, 2.5805F, 1.3826F, -1.5598F, 1.3613F, -1.5165F));

		PartDefinition cube_r21 = backleftleg5.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(12, 70).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5565F, 3.8843F, 1.1053F, 1.4404F, 1.5532F, 1.484F));

		PartDefinition cube_r22 = backleftleg5.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(22, 77).addBox(-0.9F, -2.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0249F, 1.3973F, -0.9147F, -1.5692F, 0.5234F, -1.5667F));

		PartDefinition cube_r23 = backleftleg5.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(74, 45).addBox(-1.3F, -0.1F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.0202F, -0.2386F, -0.3817F, -1.5694F, 0.3053F, -1.5671F));

		PartDefinition cube_r24 = backleftleg5.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(73, 41).addBox(-0.2F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0202F, 0.6286F, 0.6072F, -1.5708F, 1.0036F, -1.5708F));

		PartDefinition cube_r25 = backleftleg5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(29, 77).addBox(0.1F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0202F, 1.1088F, 1.9561F, -1.5708F, 1.2479F, -1.5708F));

		PartDefinition cube_r26 = backleftleg5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(71, 37).addBox(-1.3F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.0202F, 0.6286F, 0.6072F, -1.5708F, 1.4399F, -1.5708F));

		PartDefinition cube_r27 = backleftleg5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(24, 87).addBox(0.0F, -0.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0202F, 4.999F, 1.4451F, 1.5708F, 1.3875F, 1.5708F));

		PartDefinition cube_r28 = backleftleg5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(83, 51).addBox(-0.6F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0202F, 3.027F, 0.7585F, 1.5708F, 1.5272F, 1.5708F));

		PartDefinition cube_r29 = backleftleg5.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(61, 100).addBox(-1.0F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0202F, 7.7592F, 0.1849F, -1.5708F, 0.925F, -1.5708F));

		PartDefinition cube_r30 = backleftleg5.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(56, 100).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-1.0202F, 8.92F, 0.5622F, -1.5708F, 1.2915F, -1.5708F));

		PartDefinition cube_r31 = backleftleg5.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(96, 11).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0202F, 6.1594F, 0.1569F, 1.5708F, 1.5533F, 1.5708F));

		PartDefinition cube_r32 = backleftleg5.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(72, 14).addBox(-0.5048F, -1.0847F, -1.7335F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2132F, 2.2133F, 0.1024F, 1.5708F, 1.4312F, 1.5708F));

		PartDefinition backleftleg6 = backleftleg5.addOrReplaceChild("backleftleg6", CubeListBuilder.create().texOffs(15, 33).addBox(-1.8381F, -0.3918F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.113F, 9.2541F, 1.8083F, 0.2618F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg6.addOrReplaceChild("backleftleg2", CubeListBuilder.create().texOffs(32, 33).addBox(-1.8381F, -0.3918F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition backrightleg4 = Body2.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0299F, 0.9363F, 1.4868F, 0.2193F, -0.3824F, 0.1031F));

		PartDefinition cube_r33 = backrightleg4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(11, 100).addBox(-0.5F, -0.8F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0832F, 0.7828F, 0.9366F, 0.143F, 0.5193F, 0.4768F));

		PartDefinition cube_r34 = backrightleg4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(60, 77).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0065F)), PartPose.offsetAndRotation(-1.3336F, 3.1621F, 0.9281F, 0.8411F, 0.5193F, 0.4768F));

		PartDefinition cube_r35 = backrightleg4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(83, 46).addBox(-0.5F, 0.2F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(-1.3336F, 3.1621F, 0.9281F, -0.337F, 0.5193F, 0.4768F));

		PartDefinition cube_r36 = backrightleg4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(85, 99).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0336F, 2.6121F, 0.9281F, -0.5552F, 0.5193F, 0.4768F));

		PartDefinition cube_r37 = backrightleg4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(95, 87).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.0336F, 2.6121F, 0.9281F, 0.0993F, 0.5193F, 0.4768F));

		PartDefinition cube_r38 = backrightleg4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(89, 106).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0926F, -0.4093F, 0.2528F, -2.3354F, 0.5193F, 0.4768F));

		PartDefinition cube_r39 = backrightleg4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(84, 106).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(0.5978F, -0.3184F, 1.111F, -1.4191F, 0.5193F, 0.4768F));

		PartDefinition cube_r40 = backrightleg4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(72, 106).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.626F, 0.4392F, 1.7632F, -0.721F, 0.5193F, 0.4768F));

		PartDefinition cube_r41 = backrightleg4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(84, 5).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2845F, 1.3563F, 1.9687F, 0.239F, 0.5193F, 0.4768F));

		PartDefinition cube_r42 = backrightleg4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(77, 83).addBox(-0.95F, -0.6F, 1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0065F)), PartPose.offsetAndRotation(-0.7836F, 0.9157F, -0.952F, -0.1625F, 0.5193F, 0.4768F));

		PartDefinition backrightleg5 = backrightleg4.addOrReplaceChild("backrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4575F, 5.9836F, 1.7127F, 0.1618F, 0.4484F, -0.2141F));

		PartDefinition cube_r43 = backrightleg5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(76, 93).addBox(-1.3F, 3.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(84, 83).addBox(-0.7F, -0.2F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.5257F, 4.58F, 1.3174F, 1.5521F, -1.4487F, -1.5958F));

		PartDefinition cube_r44 = backrightleg5.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(84, 15).addBox(-0.7F, -0.2F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.5257F, 4.58F, 1.3174F, 1.5606F, -1.3439F, -1.6045F));

		PartDefinition cube_r45 = backrightleg5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(69, 93).addBox(-0.8F, -3.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 92).addBox(-0.8F, -2.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.6127F, 2.5805F, 1.3826F, 1.5593F, -1.3701F, -1.6031F));

		PartDefinition cube_r46 = backrightleg5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(34, 92).addBox(-0.8F, -2.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.6127F, 2.5805F, 1.3826F, -1.5056F, -1.5358F, 1.462F));

		PartDefinition cube_r47 = backrightleg5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(91, 4).addBox(-0.8F, -2.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.6127F, 2.5805F, 1.3826F, -1.5598F, -1.3613F, 1.5165F));

		PartDefinition cube_r48 = backrightleg5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(7, 71).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5565F, 3.8843F, 1.1053F, 1.4404F, -1.5532F, -1.484F));

		PartDefinition cube_r49 = backrightleg5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(67, 78).addBox(-0.1F, -2.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0249F, 1.3973F, -0.9147F, -1.5692F, -0.5234F, 1.5667F));

		PartDefinition cube_r50 = backrightleg5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(73, 74).addBox(-0.7F, -0.1F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0202F, -0.2386F, -0.3817F, -1.5694F, -0.3053F, 1.5671F));

		PartDefinition cube_r51 = backrightleg5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(74, 63).addBox(-1.8F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0202F, 0.6286F, 0.6072F, -1.5708F, -1.0036F, 1.5708F));

		PartDefinition cube_r52 = backrightleg5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(36, 78).addBox(-1.1F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0202F, 1.1088F, 1.9561F, -1.5708F, -1.2479F, 1.5708F));

		PartDefinition cube_r53 = backrightleg5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(22, 73).addBox(-0.7F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0202F, 0.6286F, 0.6072F, -1.5708F, -1.4399F, 1.5708F));

		PartDefinition cube_r54 = backrightleg5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(29, 87).addBox(-1.0F, -0.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0202F, 4.999F, 1.4451F, 1.5708F, -1.3875F, -1.5708F));

		PartDefinition cube_r55 = backrightleg5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(65, 83).addBox(-0.4F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0202F, 3.027F, 0.7585F, 1.5708F, -1.5272F, -1.5708F));

		PartDefinition cube_r56 = backrightleg5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(100, 87).addBox(0.0F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0202F, 7.7592F, 0.1849F, -1.5708F, -0.925F, 1.5708F));

		PartDefinition cube_r57 = backrightleg5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(73, 100).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(1.0202F, 8.92F, 0.5622F, -1.5708F, -1.2915F, 1.5708F));

		PartDefinition cube_r58 = backrightleg5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(96, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0202F, 6.1594F, 0.1569F, 1.5708F, -1.5533F, -1.5708F));

		PartDefinition cube_r59 = backrightleg5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(17, 73).addBox(-0.4952F, -1.0847F, -1.7335F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2132F, 2.2133F, 0.1024F, 1.5708F, -1.4312F, -1.5708F));

		PartDefinition backrightleg6 = backrightleg5.addOrReplaceChild("backrightleg6", CubeListBuilder.create().texOffs(38, 27).addBox(-2.1619F, -0.3918F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.113F, 9.2541F, 1.8083F, 0.0F, 0.0F, 0.0436F));

		PartDefinition backrightleg2 = backrightleg6.addOrReplaceChild("backrightleg2", CubeListBuilder.create().texOffs(15, 39).addBox(-2.1619F, -0.3918F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone = Body2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(74, 78).addBox(0.0F, -3.2F, -5.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F))
				.texOffs(58, 61).addBox(0.0F, -1.3F, -5.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.4019F, 0.2973F, 6.7139F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r60 = bone.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(101, 14).addBox(0.0F, -0.9896F, 0.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2784F, -1.9235F, 2.0333F, 0.0F, 0.0F));

		PartDefinition cube_r61 = bone.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(53, 93).addBox(0.0F, -2.9895F, 0.0044F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.3481F, -0.926F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r62 = bone.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(100, 99).addBox(0.0F, -0.9895F, -0.9956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5132F, 0.0603F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r63 = bone.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(100, 96).addBox(0.0F, 0.0105F, 0.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.9265F, 0.011F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r64 = bone.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 87).addBox(0.0F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -2.4265F, -1.189F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r65 = bone.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(42, 86).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -3.2F, -3.1F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r66 = bone.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(101, 11).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.2626F, -6.1252F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r67 = bone.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(5, 101).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.1059F, -6.6625F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r68 = bone.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(101, 4).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.8993F, -6.0537F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r69 = bone.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(96, 70).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -5.1F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r70 = bone.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(101, 32).addBox(-1.0011F, 0.1892F, -1.1551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 2.0F, -2.4F, 1.3497F, -0.2335F, 0.3052F));

		PartDefinition cube_r71 = bone.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(14, 90).addBox(-0.9F, -1.2762F, -1.9518F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.0F, -3.8F, 1.4224F, 0.0F, 0.2967F));

		PartDefinition cube_r72 = bone.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(83, 93).addBox(-1.0011F, 0.8879F, -0.7311F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7F, 2.0F, -2.4F, 1.0355F, -0.2335F, 0.3052F));

		PartDefinition cube_r73 = bone.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(75, 96).addBox(-1.0011F, -1.0352F, -0.147F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.7F, 2.0F, -2.4F, 0.1629F, -0.2335F, 0.3052F));

		PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(101, 29).addBox(-0.9F, 0.0139F, 0.7204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.0F, -3.8F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(65, 54).addBox(-0.9F, -0.3F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9F, 1.0F, -3.8F, 0.0F, 0.0F, 0.2967F));

		PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(19, 98).addBox(-0.9F, 0.3693F, 0.9504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.9F, 1.0F, -3.8F, -1.7541F, 0.0F, 0.2967F));

		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(95, 96).addBox(-0.9F, 1.9333F, -0.9232F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.0F, -3.8F, -0.7854F, 0.0F, 0.2967F));

		PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(19, 87).addBox(-0.9F, 3.5395F, -2.7173F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.0F, -3.8F, -0.3142F, 0.0F, 0.2967F));

		PartDefinition cube_r79 = bone.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(96, 83).addBox(-0.9F, 1.3763F, -3.0192F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9F, 1.0F, -3.8F, -0.2269F, 0.0F, 0.2967F));

		PartDefinition cube_r80 = bone.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(100, 93).addBox(-0.9F, 2.0545F, -1.2962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.0F, -3.8F, -0.9687F, 0.0F, 0.2967F));

		PartDefinition cube_r81 = bone.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(86, 23).addBox(-0.9F, 0.6768F, -2.212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9F, 1.0F, -3.8F, -0.5323F, 0.0F, 0.2967F));

		PartDefinition cube_r82 = bone.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(12, 86).addBox(-0.9F, 0.0506F, -2.0609F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.0F, -3.8F, -0.7069F, 0.0F, 0.0F));

		PartDefinition bone4 = Body2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(74, 78).mirror().addBox(-1.0F, -3.2F, -5.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(58, 61).mirror().addBox(-1.0F, -1.3F, -5.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4019F, 0.2973F, 6.7139F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r83 = bone4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(101, 14).mirror().addBox(-1.0F, -0.9896F, 0.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2784F, -1.9235F, 2.0333F, 0.0F, 0.0F));

		PartDefinition cube_r84 = bone4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(53, 93).mirror().addBox(-1.0F, -2.9895F, 0.0044F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3481F, -0.926F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r85 = bone4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(100, 99).mirror().addBox(-1.0F, -0.9895F, -0.9956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5132F, 0.0603F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r86 = bone4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(100, 96).mirror().addBox(-1.0F, 0.0105F, 0.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.9265F, 0.011F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bone4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-1.0F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4265F, -1.189F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(42, 86).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.2F, -3.1F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r89 = bone4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(101, 11).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2626F, -6.1252F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r90 = bone4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(5, 101).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1059F, -6.6625F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r91 = bone4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(101, 4).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.8993F, -6.0537F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r92 = bone4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(96, 70).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.2F, -5.1F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r93 = bone4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(101, 32).mirror().addBox(0.0011F, 0.1892F, -1.1551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.0F, -2.4F, 1.3497F, 0.2335F, -0.3052F));

		PartDefinition cube_r94 = bone4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(14, 90).mirror().addBox(-0.1F, -1.2762F, -1.9518F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.0F, -3.8F, 1.4224F, 0.0F, -0.2967F));

		PartDefinition cube_r95 = bone4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(83, 93).mirror().addBox(0.0011F, 0.8879F, -0.7311F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.0F, -2.4F, 1.0355F, 0.2335F, -0.3052F));

		PartDefinition cube_r96 = bone4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(75, 96).mirror().addBox(0.0011F, -1.0352F, -0.147F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.0F, -2.4F, 0.1629F, 0.2335F, -0.3052F));

		PartDefinition cube_r97 = bone4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(101, 29).mirror().addBox(-0.1F, 0.0139F, 0.7204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.0F, -3.8F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r98 = bone4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(65, 54).mirror().addBox(-0.1F, -0.3F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.0F, -3.8F, 0.0F, 0.0F, -0.2967F));

		PartDefinition cube_r99 = bone4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(19, 98).mirror().addBox(-0.1F, 0.3693F, 0.9504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.0F, -3.8F, -1.7541F, 0.0F, -0.2967F));

		PartDefinition cube_r100 = bone4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(95, 96).mirror().addBox(-0.1F, 1.9333F, -0.9232F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.0F, -3.8F, -0.7854F, 0.0F, -0.2967F));

		PartDefinition cube_r101 = bone4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(19, 87).mirror().addBox(-0.1F, 3.5395F, -2.7173F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.0F, -3.8F, -0.3142F, 0.0F, -0.2967F));

		PartDefinition cube_r102 = bone4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(96, 83).mirror().addBox(-0.1F, 1.3763F, -3.0192F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.0F, -3.8F, -0.2269F, 0.0F, -0.2967F));

		PartDefinition cube_r103 = bone4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(100, 93).mirror().addBox(-0.1F, 2.0545F, -1.2962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.0F, -3.8F, -0.9687F, 0.0F, -0.2967F));

		PartDefinition cube_r104 = bone4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(86, 23).mirror().addBox(-0.1F, 0.6768F, -2.212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.0F, -3.8F, -0.5323F, 0.0F, -0.2967F));

		PartDefinition cube_r105 = bone4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(12, 86).mirror().addBox(-0.1F, 0.0506F, -2.0609F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.0F, -3.8F, -0.7069F, 0.0F, 0.0F));

		PartDefinition Tail = Body2.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1388F, 7.8175F, -0.0825F, 0.2174F, -0.0178F));

		PartDefinition cube_r106 = Tail.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(15, 45).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.123F, 0.9183F, -0.0354F, 0.1744F, -0.0062F));

		PartDefinition cube_r107 = Tail.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(15, 45).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.123F, 0.9183F, -0.0354F, -0.1744F, 0.0062F));

		PartDefinition cube_r108 = Tail.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(42, 9).addBox(-0.5F, -1.3626F, -0.4936F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2787F, 0.3822F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r109 = Tail.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(11, 107).addBox(0.0F, -1.6028F, -0.049F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4787F, 4.9822F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r110 = Tail.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(8, 107).addBox(0.0F, -1.6726F, -0.0502F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4787F, 2.9822F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r111 = Tail.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(81, 102).addBox(0.0F, 1.7576F, 3.9521F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 102).addBox(0.0F, 0.8576F, 1.9521F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 107).addBox(0.0F, 0.1576F, -0.0479F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5924F, 0.8171F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r112 = Tail.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(5, 107).addBox(0.0F, -1.8424F, -0.0479F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5787F, 0.9822F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(32, 39).addBox(-0.5F, -0.7281F, -0.1798F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.001F))
				.texOffs(24, 107).addBox(0.0F, -1.8281F, 4.8202F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7166F, 5.8009F, 0.0906F, 0.1738F, 0.0157F));

		PartDefinition cube_r113 = Tail2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(21, 107).addBox(0.0F, -1.1136F, 0.1035F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8145F, 2.7167F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r114 = Tail2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(18, 107).addBox(0.0F, -1.5136F, 0.0035F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7145F, 0.8167F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Tail2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-1.0F, 0.0F, 0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2281F, 0.7202F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r116 = Tail2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 56).addBox(0.0F, 0.0F, 0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2281F, 0.7202F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r117 = Tail2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(30, 107).addBox(0.0F, 4.2576F, 7.9521F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 102).addBox(0.0F, 2.6576F, 5.9521F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1242F, -4.9838F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(55, 25).addBox(-0.5F, -0.9886F, -0.0036F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2599F, 5.7629F, 0.1524F, 0.2157F, 0.0329F));

		PartDefinition cube_r118 = Tail3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(80, 107).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9886F, 2.9964F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Tail3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(77, 107).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9886F, 0.9964F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r120 = Tail3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(36, 107).addBox(0.0F, 5.7576F, 11.9521F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 107).addBox(0.0F, 5.0576F, 9.9521F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1357F, -10.7466F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(43, 47).addBox(-0.5F, -0.1816F, -0.0607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(50, 107).addBox(0.0F, -0.7816F, 1.9393F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7761F, 4.8736F, 0.141F, 0.2593F, 0.0364F));

		PartDefinition cube_r121 = Tail4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(47, 107).addBox(0.0F, -0.5992F, 0.0174F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1823F, 3.9218F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r122 = Tail4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(108, 6).addBox(0.0F, 8.7576F, 17.9521F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 107).addBox(0.0F, 8.1576F, 15.9521F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 107).addBox(0.0F, 6.4576F, 13.9521F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6404F, -15.6202F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r123 = Tail4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(46, 90).addBox(0.0F, -0.7992F, 0.0174F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1823F, -0.0782F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.1816F, -0.0607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(65, 107).addBox(0.0F, -0.6816F, 0.9393F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 107).addBox(0.0F, -0.5816F, 2.9393F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0363F, 4.7717F, 0.2645F, 0.2108F, 0.0566F));

		PartDefinition cube_r124 = Tail5.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(108, 19).addBox(0.0F, 10.2576F, 21.4521F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 16).addBox(0.0F, 9.4576F, 19.4521F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.604F, -20.3919F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(30, 47).addBox(-0.5F, -0.1816F, -0.0607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F))
				.texOffs(26, 51).addBox(0.0F, -0.5816F, -0.0607F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 70).addBox(0.0F, -0.4816F, 3.9393F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 78).addBox(0.0F, -0.5816F, 1.9393F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.01F, 4.6572F, -0.0034F, 0.1309F, -0.0004F));

		PartDefinition cube_r125 = Tail6.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(108, 22).addBox(0.0F, 10.9576F, 23.4521F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.594F, -25.0492F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(47, 39).addBox(-0.5F, -0.1816F, -0.0607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0099F, 4.9253F, -0.0928F, -0.2173F, 0.0201F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.1816F, -0.0607F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.045F, 4.9161F, -0.2228F, -0.2983F, 0.0665F));

		PartDefinition Body = Body2.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(52, 54).addBox(-0.5F, -1.5801F, -4.8499F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(49, 102).addBox(0.0F, -4.5801F, -0.8499F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5235F, -0.0541F, -0.091F, -0.1337F, -0.0255F));

		PartDefinition cube_r126 = Body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(39, 102).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5801F, -2.8499F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r127 = Body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(102, 38).addBox(0.0F, -2.4943F, 0.0613F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5859F, -4.9111F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r128 = Body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(97, 59).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, -1.2362F, -0.1722F, -0.0105F, 0.0373F, -0.8271F));

		PartDefinition cube_r129 = Body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(97, 57).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, -1.2362F, -0.1722F, 0.0079F, 0.0457F, -0.3904F));

		PartDefinition cube_r130 = Body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(72, 22).mirror().addBox(-4.2479F, -3.2346F, -0.6081F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0478F, -1.0362F, -2.1722F, -0.0037F, 0.1125F, -1.3056F));

		PartDefinition cube_r131 = Body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(70, 87).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0478F, -1.0362F, -2.1722F, 0.0889F, 0.0787F, -0.3854F));

		PartDefinition cube_r132 = Body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(90, 49).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0478F, -1.0362F, -2.1722F, 0.0489F, 0.1015F, -0.823F));

		PartDefinition cube_r133 = Body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(89, 19).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1522F, -0.9362F, -4.1722F, 0.1213F, 0.0918F, -0.3826F));

		PartDefinition cube_r134 = Body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(68, 96).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1522F, -0.9362F, -4.1722F, 0.0728F, 0.127F, -0.8202F));

		PartDefinition cube_r135 = Body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(86, 27).mirror().addBox(-6.2479F, -3.2346F, -0.6081F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1522F, -0.9362F, -4.1722F, 0.0056F, 0.1462F, -1.3044F));

		PartDefinition cube_r136 = Body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(97, 57).addBox(0.7299F, -0.2379F, -0.6278F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5478F, -1.2362F, -0.1722F, 0.0079F, -0.0457F, 0.3904F));

		PartDefinition cube_r137 = Body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(97, 59).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5478F, -1.2362F, -0.1722F, -0.0105F, -0.0373F, 0.8271F));

		PartDefinition cube_r138 = Body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(90, 49).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -1.0362F, -2.1722F, 0.0489F, -0.1015F, 0.823F));

		PartDefinition cube_r139 = Body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(70, 87).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -1.0362F, -2.1722F, 0.0889F, -0.0787F, 0.3854F));

		PartDefinition cube_r140 = Body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(72, 22).addBox(3.2479F, -3.2346F, -0.6081F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -1.0362F, -2.1722F, -0.0037F, -0.1125F, 1.3056F));

		PartDefinition cube_r141 = Body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(86, 27).addBox(3.2479F, -3.2346F, -0.6081F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1522F, -0.9362F, -4.1722F, 0.0056F, -0.1462F, 1.3044F));

		PartDefinition cube_r142 = Body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(68, 96).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1522F, -0.9362F, -4.1722F, 0.0728F, -0.127F, 0.8202F));

		PartDefinition cube_r143 = Body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(89, 19).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1522F, -0.9362F, -4.1722F, 0.1213F, -0.0918F, 0.3826F));

		PartDefinition cube_r144 = Body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(23, 0).addBox(-3.0F, -4.0943F, 0.0613F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 8.7141F, -2.5111F, 0.48F, 0.0F, 0.0F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(39, 54).addBox(-0.5F, -0.7943F, -4.8137F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7859F, -4.9111F, 0.1577F, -0.0862F, -0.0137F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(31, 102).addBox(0.0F, -2.2943F, -0.0387F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -1.775F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(28, 102).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7943F, -3.8137F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(56, 52).mirror().addBox(-8.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -1.0611F, -0.0129F, 0.0788F, -1.3065F));

		PartDefinition cube_r148 = body3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(97, 55).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -1.0611F, 0.0251F, 0.0759F, -0.8251F));

		PartDefinition cube_r149 = body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(87, 68).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -1.0611F, 0.0565F, 0.0655F, -0.3878F));

		PartDefinition cube_r150 = body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(87, 66).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -3.0611F, 0.0889F, 0.0787F, -0.3854F));

		PartDefinition cube_r151 = body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(97, 53).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -3.0611F, 0.0489F, 0.1015F, -0.823F));

		PartDefinition cube_r152 = body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(49, 35).mirror().addBox(-9.2479F, -3.2346F, -0.6081F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -3.0611F, -0.0037F, 0.1125F, -1.3056F));

		PartDefinition cube_r153 = body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(87, 68).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -1.0611F, 0.0565F, -0.0655F, 0.3878F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(97, 55).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -1.0611F, 0.0251F, -0.0759F, 0.8251F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(56, 52).addBox(3.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -1.0611F, -0.0129F, -0.0788F, 1.3065F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(49, 35).addBox(3.2479F, -3.2346F, -0.6081F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -3.0611F, -0.0037F, -0.1125F, 1.3056F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(97, 53).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -3.0611F, 0.0489F, -0.1015F, 0.823F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(87, 66).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -3.0611F, 0.0889F, -0.0787F, 0.3854F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.9943F, -0.0387F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.2F, -3.775F, 0.3054F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(26, 54).addBox(-0.5F, -0.7943F, -5.0387F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.7F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r160 = body4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(25, 102).addBox(0.0F, -2.2943F, -0.0387F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -1.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r161 = body4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(22, 102).addBox(0.0F, -2.3943F, -0.0387F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r162 = body4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(19, 102).addBox(0.0F, -2.0943F, -0.8387F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -4.2F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-11.2479F, -3.2346F, -0.6081F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -2.3611F, -0.0174F, 0.062F, -1.3068F));

		PartDefinition cube_r164 = body4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(97, 51).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -2.3611F, 0.0132F, 0.063F, -0.8259F));

		PartDefinition cube_r165 = body4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(87, 38).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -2.3611F, 0.0403F, 0.0589F, -0.3888F));

		PartDefinition cube_r166 = body4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(44, 4).mirror().addBox(-10.2479F, -3.2346F, -0.6081F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -0.3611F, -0.022F, 0.0451F, -1.3071F));

		PartDefinition cube_r167 = body4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(97, 49).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -0.3611F, 0.0014F, 0.0502F, -0.8266F));

		PartDefinition cube_r168 = body4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(87, 36).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -0.3611F, 0.0241F, 0.0523F, -0.3897F));

		PartDefinition cube_r169 = body4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(42, 17).mirror().addBox(-11.2479F, -3.2346F, -0.6081F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -4.3611F, 0.0009F, 0.1294F, -1.3051F));

		PartDefinition cube_r170 = body4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(96, 74).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -4.3611F, 0.0608F, 0.1143F, -0.8217F));

		PartDefinition cube_r171 = body4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(86, 29).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1503F, -4.3611F, 0.1051F, 0.0852F, -0.3841F));

		PartDefinition cube_r172 = body4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(87, 38).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -2.3611F, 0.0403F, -0.0589F, 0.3888F));

		PartDefinition cube_r173 = body4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(97, 51).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -2.3611F, 0.0132F, -0.063F, 0.8259F));

		PartDefinition cube_r174 = body4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(44, 0).addBox(3.2479F, -3.2346F, -0.6081F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -2.3611F, -0.0174F, -0.062F, 1.3068F));

		PartDefinition cube_r175 = body4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(87, 36).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -0.3611F, 0.0241F, -0.0523F, 0.3897F));

		PartDefinition cube_r176 = body4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(97, 49).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -0.3611F, 0.0014F, -0.0502F, 0.8266F));

		PartDefinition cube_r177 = body4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(44, 4).addBox(3.2479F, -3.2346F, -0.6081F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -0.3611F, -0.022F, -0.0451F, 1.3071F));

		PartDefinition cube_r178 = body4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(86, 29).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -4.3611F, 0.1051F, -0.0852F, 0.3841F));

		PartDefinition cube_r179 = body4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(96, 74).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -4.3611F, 0.0608F, -0.1143F, 0.8217F));

		PartDefinition cube_r180 = body4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(42, 17).addBox(3.2479F, -3.2346F, -0.6081F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1503F, -4.3611F, 0.0009F, -0.1294F, 1.3051F));

		PartDefinition cube_r181 = body4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(23, 19).addBox(-2.5F, -2.1943F, -5.0387F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.4F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition shoulder = body4.addOrReplaceChild("shoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2972F, -5.0528F, 0.1051F, -0.0868F, -0.0091F));

		PartDefinition cube_r182 = shoulder.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(101, 82).addBox(0.0F, -2.4807F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.9F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r183 = shoulder.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(16, 101).addBox(0.0F, -2.9759F, 0.0025F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -3.9F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r184 = shoulder.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(16, 95).addBox(0.0F, -3.9711F, 0.005F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -5.9F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r185 = shoulder.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(49, 33).mirror().addBox(-10.2479F, -3.2346F, -0.6081F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1475F, -5.2083F, 0.0102F, 0.163F, -1.3037F));

		PartDefinition cube_r186 = shoulder.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(97, 80).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1475F, -5.2083F, 0.0848F, 0.1398F, -0.8186F));

		PartDefinition cube_r187 = shoulder.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(88, 2).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1475F, -5.2083F, 0.1376F, 0.0983F, -0.3811F));

		PartDefinition cube_r188 = shoulder.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.2475F, -3.2083F, 0.0727F, 0.0721F, -0.3866F));

		PartDefinition cube_r189 = shoulder.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(97, 78).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.2475F, -3.2083F, 0.037F, 0.0887F, -0.8241F));

		PartDefinition cube_r190 = shoulder.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(44, 6).mirror().addBox(-10.2479F, -3.2346F, -0.6081F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.2475F, -3.2083F, -0.0083F, 0.0957F, -1.3061F));

		PartDefinition cube_r191 = shoulder.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(44, 2).mirror().addBox(-11.2479F, -3.2346F, -0.6081F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.3475F, -1.2083F, -0.022F, 0.0451F, -1.3071F));

		PartDefinition cube_r192 = shoulder.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(97, 76).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.3475F, -1.2083F, 0.0014F, 0.0502F, -0.8266F));

		PartDefinition cube_r193 = shoulder.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(87, 70).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.3475F, -1.2083F, 0.0241F, 0.0523F, -0.3897F));

		PartDefinition cube_r194 = shoulder.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(88, 2).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1475F, -5.2083F, 0.1376F, -0.0983F, 0.3811F));

		PartDefinition cube_r195 = shoulder.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(97, 80).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1475F, -5.2083F, 0.0848F, -0.1398F, 0.8186F));

		PartDefinition cube_r196 = shoulder.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(49, 33).addBox(3.2479F, -3.2346F, -0.6081F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1475F, -5.2083F, 0.0102F, -0.163F, 1.3037F));

		PartDefinition cube_r197 = shoulder.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(44, 6).addBox(3.2479F, -3.2346F, -0.6081F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.2475F, -3.2083F, -0.0083F, -0.0957F, 1.3061F));

		PartDefinition cube_r198 = shoulder.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(97, 78).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.2475F, -3.2083F, 0.037F, -0.0887F, 0.8241F));

		PartDefinition cube_r199 = shoulder.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(88, 0).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.2475F, -3.2083F, 0.0727F, -0.0721F, 0.3866F));

		PartDefinition cube_r200 = shoulder.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(87, 70).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.3475F, -1.2083F, 0.0241F, -0.0523F, 0.3897F));

		PartDefinition cube_r201 = shoulder.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(97, 76).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.3475F, -1.2083F, 0.0014F, -0.0502F, 0.8266F));

		PartDefinition cube_r202 = shoulder.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(44, 2).addBox(3.2479F, -3.2346F, -0.6081F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.3475F, -1.2083F, -0.022F, -0.0451F, 1.3071F));

		PartDefinition cube_r203 = shoulder.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(44, 19).addBox(-2.0F, -2.3054F, -2.9447F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.5F, -1.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r204 = shoulder.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -1.8F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -5.3F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neck = shoulder.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(13, 51).addBox(-0.5F, -0.7598F, -4.9649F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0196F, -5.7755F, -0.2393F, 0.0F, 0.0F));

		PartDefinition cube_r205 = Neck.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(8, 94).addBox(0.0F, -4.5468F, -0.7887F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.713F, -1.1761F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r206 = Neck.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(59, 87).addBox(0.0F, -5.1468F, -0.7887F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.713F, -3.1761F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r207 = Neck.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(57, 8).mirror().addBox(0.0F, -1.0F, 0.2F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.5376F, 11.4303F, -0.907F, 0.1625F, 0.3768F, 0.0753F));

		PartDefinition cube_r208 = Neck.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(60, 43).mirror().addBox(-7.3745F, -1.3694F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.0279F, -3.3328F, 0.4486F, 0.5537F, -1.0598F));

		PartDefinition cube_r209 = Neck.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(88, 53).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.0279F, -3.3328F, 0.6312F, 0.3324F, -0.6415F));

		PartDefinition cube_r210 = Neck.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(88, 51).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1279F, -1.2328F, 0.4016F, 0.1976F, -0.3419F));

		PartDefinition cube_r211 = Neck.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(88, 97).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1279F, -1.2328F, 0.2859F, 0.3397F, -0.7705F));

		PartDefinition cube_r212 = Neck.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(57, 14).mirror().addBox(-8.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1279F, -1.2328F, 0.0904F, 0.4317F, -1.28F));

		PartDefinition cube_r213 = Neck.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(88, 53).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.0279F, -3.3328F, 0.6312F, -0.3324F, 0.6415F));

		PartDefinition cube_r214 = Neck.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(60, 43).addBox(2.3745F, -1.3694F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.0279F, -3.3328F, 0.4486F, -0.5537F, 1.0598F));

		PartDefinition cube_r215 = Neck.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(57, 14).addBox(3.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1279F, -1.2328F, 0.0904F, -0.4317F, 1.28F));

		PartDefinition cube_r216 = Neck.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(88, 97).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1279F, -1.2328F, 0.2859F, -0.3397F, 0.7705F));

		PartDefinition cube_r217 = Neck.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(88, 51).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1279F, -1.2328F, 0.4016F, -0.1976F, 0.3419F));

		PartDefinition cube_r218 = Neck.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(57, 8).addBox(-2.0F, -1.0F, 0.2F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.5376F, 11.4303F, -0.907F, 0.1625F, -0.3768F, -0.0753F));

		PartDefinition cube_r219 = Neck.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(56, 46).addBox(-1.0F, -1.0F, -0.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 11.5611F, -0.5509F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r220 = Neck.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(19, 27).addBox(-2.5F, -0.1F, -2.1F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 10.4902F, -2.4649F, -0.0873F, 0.0F, 0.0F));

		PartDefinition frontleftleg4 = Neck.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1041F, 7.5692F, -0.6134F, 0.9068F, 0.0632F, 1.0674F));

		PartDefinition cube_r221 = frontleftleg4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(77, 11).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.806F, 2.1429F, -0.3893F, -0.8971F, -0.3938F, -0.9005F));

		PartDefinition cube_r222 = frontleftleg4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(102, 0).addBox(-0.5F, -0.7F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.5174F, 0.7534F, -2.5784F, -2.817F, -0.3938F, -0.9005F));

		PartDefinition cube_r223 = frontleftleg4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(81, 0).addBox(0.4211F, -1.1094F, 0.6242F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, -2.1625F, -0.3938F, -0.9005F));

		PartDefinition cube_r224 = frontleftleg4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5F, -1.4F, -0.15F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.1463F, 0.0639F, -1.829F, -0.583F, -0.3938F, -0.9005F));

		PartDefinition cube_r225 = frontleftleg4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(34, 88).addBox(-0.5F, -1.15F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(8.0836F, 7.3672F, 1.5737F, 0.4904F, -0.3938F, -0.9005F));

		PartDefinition cube_r226 = frontleftleg4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(14, 81).addBox(-0.5F, 0.45F, -1.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.2516F, 5.585F, 0.9513F, 0.1064F, -0.3938F, -0.9005F));

		PartDefinition cube_r227 = frontleftleg4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(82, 72).addBox(-0.5F, -1.1F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.2516F, 5.585F, 0.9513F, -0.199F, -0.3938F, -0.9005F));

		PartDefinition cube_r228 = frontleftleg4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(7, 79).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2516F, 5.585F, 0.9513F, 0.7173F, -0.3938F, -0.9005F));

		PartDefinition cube_r229 = frontleftleg4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(103, 7).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5469F, 2.2641F, 1.7214F, -0.5917F, -0.3938F, -0.9005F));

		PartDefinition cube_r230 = frontleftleg4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(81, 78).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0753F, 1.1297F, 2.0072F, -0.1554F, -0.3938F, -0.9005F));

		PartDefinition cube_r231 = frontleftleg4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(81, 57).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7543F, -0.143F, 0.6219F, -0.7226F, -0.3938F, -0.9005F));

		PartDefinition cube_r232 = frontleftleg4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(13, 58).addBox(0.4211F, -1.9409F, -0.5672F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6577F, 1.51F, -0.7719F, 0.1501F, -0.3938F, -0.9005F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5316F, 7.233F, 2.262F, -0.616F, 0.1185F, -2.4537F));

		PartDefinition cube_r233 = frontleftleg5.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(63, 96).addBox(-0.1237F, -1.7998F, -1.3488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0115F, 1.6943F, 1.4029F, 0.0432F, -0.1321F, -0.0115F));

		PartDefinition cube_r234 = frontleftleg5.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(19, 93).addBox(-0.1237F, -2.4248F, -0.8738F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.0115F, 1.6943F, 1.4029F, -0.1313F, -0.1321F, -0.0115F));

		PartDefinition cube_r235 = frontleftleg5.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(100, 43).addBox(-0.5F, -0.2F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4602F, -0.6347F, 0.5081F, 0.6541F, -0.1321F, -0.0115F));

		PartDefinition cube_r236 = frontleftleg5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(100, 46).addBox(-0.5F, -0.15F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4602F, -0.6347F, 0.5081F, 0.8722F, -0.1321F, -0.0115F));

		PartDefinition cube_r237 = frontleftleg5.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(68, 68).addBox(0.0F, -2.0F, -0.85F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 68).addBox(0.0F, -2.0F, -0.35F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0115F, 3.2942F, 0.6029F, -0.175F, -0.1321F, -0.0115F));

		PartDefinition cube_r238 = frontleftleg5.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(7, 62).addBox(0.0F, -1.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, 1.9788F, -0.925F, -0.0441F, -0.1321F, -0.0115F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5842F, 7.7926F, -1.3614F, 1.3371F, -1.2627F, 0.8924F));

		PartDefinition cube_r239 = frontleftleg6.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(0, 9).addBox(-2.0176F, 2.8125F, -5.3464F, 5.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0123F, -2.7407F, 0.2292F, -0.1313F, -0.1321F, -0.0115F));

		PartDefinition frontrightleg4 = Neck.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1041F, 7.5692F, -0.6134F, 0.8488F, 0.3423F, -0.5815F));

		PartDefinition cube_r240 = frontrightleg4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(77, 16).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.806F, 2.1429F, -0.3893F, -0.8971F, 0.3938F, 0.9005F));

		PartDefinition cube_r241 = frontrightleg4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(105, 41).addBox(-0.5F, -0.7F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-2.5174F, 0.7534F, -2.5784F, -2.817F, 0.3938F, 0.9005F));

		PartDefinition cube_r242 = frontrightleg4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(58, 82).addBox(-1.4211F, -1.1094F, 0.6242F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, -2.1625F, 0.3938F, 0.9005F));

		PartDefinition cube_r243 = frontrightleg4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(74, 57).addBox(-0.5F, -1.4F, -0.15F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.1463F, 0.0639F, -1.829F, -0.583F, 0.3938F, 0.9005F));

		PartDefinition cube_r244 = frontrightleg4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(76, 89).addBox(-0.5F, -1.15F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-8.0836F, 7.3672F, 1.5737F, 0.4904F, 0.3938F, 0.9005F));

		PartDefinition cube_r245 = frontrightleg4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(82, 31).addBox(-0.5F, 0.45F, -1.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-6.2516F, 5.585F, 0.9513F, 0.1064F, 0.3938F, 0.9005F));

		PartDefinition cube_r246 = frontrightleg4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(35, 83).addBox(-0.5F, -1.1F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.2516F, 5.585F, 0.9513F, -0.199F, 0.3938F, 0.9005F));

		PartDefinition cube_r247 = frontrightleg4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(79, 26).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2516F, 5.585F, 0.9513F, 0.7173F, 0.3938F, 0.9005F));

		PartDefinition cube_r248 = frontrightleg4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(105, 38).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5469F, 2.2641F, 1.7214F, -0.5917F, 0.3938F, 0.9005F));

		PartDefinition cube_r249 = frontrightleg4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(28, 82).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0753F, 1.1297F, 2.0072F, -0.1554F, 0.3938F, 0.9005F));

		PartDefinition cube_r250 = frontrightleg4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(21, 82).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7543F, -0.143F, 0.6219F, -0.7226F, 0.3938F, 0.9005F));

		PartDefinition cube_r251 = frontrightleg4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(20, 61).addBox(-1.4211F, -1.9409F, -0.5672F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6577F, 1.51F, -0.7719F, 0.1501F, 0.3938F, 0.9005F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.5316F, 7.233F, 2.262F, -0.6939F, -0.7419F, 1.3527F));

		PartDefinition cube_r252 = frontrightleg5.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(96, 66).addBox(-0.8763F, -1.7998F, -1.3488F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0115F, 1.6943F, 1.4029F, 0.0432F, 0.1321F, 0.0115F));

		PartDefinition cube_r253 = frontrightleg5.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(93, 21).addBox(-0.8763F, -2.4248F, -0.8738F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0115F, 1.6943F, 1.4029F, -0.1313F, 0.1321F, 0.0115F));

		PartDefinition cube_r254 = frontrightleg5.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(44, 100).addBox(-0.5F, -0.2F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4602F, -0.6347F, 0.5081F, 0.6541F, 0.1321F, 0.0115F));

		PartDefinition cube_r255 = frontrightleg5.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(100, 61).addBox(-0.5F, -0.15F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4602F, -0.6347F, 0.5081F, 0.8722F, 0.1321F, 0.0115F));

		PartDefinition cube_r256 = frontrightleg5.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(69, 45).addBox(-1.0F, -2.0F, -0.85F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 69).addBox(-1.0F, -2.0F, -0.35F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0115F, 3.2942F, 0.6029F, -0.175F, 0.1321F, 0.0115F));

		PartDefinition cube_r257 = frontrightleg5.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(36, 69).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, 1.9788F, -0.925F, -0.0441F, 0.1321F, 0.0115F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5842F, 7.7926F, -1.3614F, -0.5526F, 1.2878F, -0.7697F));

		PartDefinition cube_r258 = frontrightleg6.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 17).addBox(-2.9824F, 2.8125F, -5.3464F, 5.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0123F, -2.7407F, 0.2292F, -0.1313F, 0.1321F, 0.0115F));

		PartDefinition bone2 = Neck.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.119F, 3.3064F, 0.4011F, 0.2356F, 0.1309F, -0.1745F));

		PartDefinition cube_r259 = bone2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(34, 101).addBox(0.0F, 0.0F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -3.1662F, 5.6417F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r260 = bone2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 62).addBox(0.0F, -5.0F, -0.025F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -2.3053F, 0.3258F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r261 = bone2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(98, 23).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.6434F, -3.8625F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r262 = bone2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(70, 8).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.6089F, 4.0042F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r263 = bone2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(58, 96).addBox(0.0F, 0.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.3259F, 2.184F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r264 = bone2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(46, 96).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -6.1608F, 3.1703F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r265 = bone2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(96, 35).addBox(0.0F, -1.6F, 0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -5.3234F, 1.5367F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r266 = bone2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(0, 70).addBox(0.0F, -3.0F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -2.8963F, -0.2266F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r267 = bone2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(95, 44).addBox(0.0F, -2.4F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.3859F, -2.0918F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r268 = bone2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(7, 90).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2727F, -3.0854F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r269 = bone2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(98, 8).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.3382F, -4.0533F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r270 = bone2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(20, 58).addBox(0.0F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 1.3398F, -3.9708F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r271 = bone2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(41, 90).addBox(-1.6833F, 1.9297F, -1.1066F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.5996F, -5.3842F, -0.0698F, 0.0F, 0.829F));

		PartDefinition cube_r272 = bone2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 96).addBox(-1.0F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0385F, 1.2288F, -5.2644F, -0.7078F, -0.1694F, 0.2662F));

		PartDefinition cube_r273 = bone2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(90, 44).addBox(-1.082F, -2.9023F, -0.3038F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 3.3996F, -6.2842F, -0.3142F, 0.0F, 0.5847F));

		PartDefinition cube_r274 = bone2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(96, 31).addBox(0.0F, -2.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.5252F, -3.4001F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r275 = bone2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(0, 77).addBox(-0.4697F, -0.7307F, -0.7273F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0697F, 2.9801F, -3.2299F, -0.1396F, 0.0F, 0.9076F));

		PartDefinition cube_r276 = bone2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(67, 60).addBox(-0.4697F, -4.6819F, 0.0726F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0697F, 2.9801F, -3.2299F, -2.1904F, 0.0F, 0.9076F));

		PartDefinition cube_r277 = bone2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(56, 67).addBox(-0.4697F, -3.7681F, 1.7212F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0697F, 2.9801F, -3.2299F, -1.7977F, 0.0F, 0.9076F));

		PartDefinition cube_r278 = bone2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(77, 6).addBox(-0.4697F, 0.4276F, -1.0372F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(53, 75).addBox(-0.4697F, -0.5724F, -1.0372F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0697F, 2.9801F, -3.2299F, -1.0996F, 0.0F, 0.9076F));

		PartDefinition cube_r279 = bone2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(80, 67).addBox(0.0F, 0.0F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4791F, -3.0602F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r280 = bone2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(80, 36).addBox(0.0F, 0.0F, -0.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -0.5448F, -2.1054F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r281 = bone2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(73, 68).addBox(0.0F, -1.0F, -0.925F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.9774F, 0.0F, 0.0F));

		PartDefinition bone3 = Neck.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.119F, 3.3064F, 0.4011F, 0.2356F, -0.1309F, 0.1745F));

		PartDefinition cube_r282 = bone3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(34, 101).mirror().addBox(-1.0F, 0.0F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.1662F, 5.6417F, -1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r283 = bone3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-1.0F, -5.0F, -0.025F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.3053F, 0.3258F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r284 = bone3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(98, 23).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6434F, -3.8625F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r285 = bone3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(70, 8).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.6089F, 4.0042F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r286 = bone3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(58, 96).mirror().addBox(-1.0F, 0.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -6.3259F, 2.184F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r287 = bone3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(46, 96).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -6.1608F, 3.1703F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r288 = bone3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(96, 35).mirror().addBox(-1.0F, -1.6F, 0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.3234F, 1.5367F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r289 = bone3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-1.0F, -3.0F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.8963F, -0.2266F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r290 = bone3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(95, 44).mirror().addBox(-1.0F, -2.4F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3859F, -2.0918F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r291 = bone3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(7, 90).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2727F, -3.0854F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r292 = bone3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(98, 8).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3382F, -4.0533F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r293 = bone3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(20, 58).mirror().addBox(-1.0F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3398F, -3.9708F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r294 = bone3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(41, 90).mirror().addBox(0.6833F, 1.9297F, -1.1066F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.5996F, -5.3842F, -0.0698F, 0.0F, -0.829F));

		PartDefinition cube_r295 = bone3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(0.0F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0385F, 1.2288F, -5.2644F, -0.7078F, 0.1694F, -0.2662F));

		PartDefinition cube_r296 = bone3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(90, 44).mirror().addBox(0.082F, -2.9023F, -0.3038F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3F, 3.3996F, -6.2842F, -0.3142F, 0.0F, -0.5847F));

		PartDefinition cube_r297 = bone3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(96, 31).mirror().addBox(-1.0F, -2.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5252F, -3.4001F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r298 = bone3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.5303F, -0.7307F, -0.7273F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0697F, 2.9801F, -3.2299F, -0.1396F, 0.0F, -0.9076F));

		PartDefinition cube_r299 = bone3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(67, 60).mirror().addBox(-0.5303F, -4.6819F, 0.0726F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0697F, 2.9801F, -3.2299F, -2.1904F, 0.0F, -0.9076F));

		PartDefinition cube_r300 = bone3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(56, 67).mirror().addBox(-0.5303F, -3.7681F, 1.7212F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0697F, 2.9801F, -3.2299F, -1.7977F, 0.0F, -0.9076F));

		PartDefinition cube_r301 = bone3.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(77, 6).mirror().addBox(-0.5303F, 0.4276F, -1.0372F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 75).mirror().addBox(-0.5303F, -0.5724F, -1.0372F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.0697F, 2.9801F, -3.2299F, -1.0996F, 0.0F, -0.9076F));

		PartDefinition cube_r302 = bone3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(80, 67).mirror().addBox(-1.0F, 0.0F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4791F, -3.0602F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r303 = bone3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(80, 36).mirror().addBox(-1.0F, 0.0F, -0.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5448F, -2.1054F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r304 = bone3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(73, 68).mirror().addBox(-1.0F, -1.0F, -0.925F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.9774F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.313F, -4.8762F, 0.179F, -0.0138F, -0.1784F));

		PartDefinition cube_r305 = Neck2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(5, 94).addBox(0.0F, -5.1283F, -1.994F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.261F, 0.9737F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r306 = Neck2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(53, 80).addBox(0.0F, -4.0997F, -1.8796F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.561F, -2.1263F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r307 = Neck2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(44, 25).mirror().addBox(-6.3745F, -1.3694F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1522F, -0.115F, -2.9566F, -0.4571F, 0.4472F, -1.2936F));

		PartDefinition cube_r308 = Neck2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(88, 57).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1522F, -0.115F, -2.9566F, -0.2159F, 0.6017F, -0.8201F));

		PartDefinition cube_r309 = Neck2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(88, 55).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.285F, -0.4566F, 0.2046F, 0.3954F, -0.7853F));

		PartDefinition cube_r310 = Neck2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(68, 29).mirror().addBox(-6.3745F, -1.3694F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.285F, -0.4566F, 0.0095F, 0.4353F, -1.261F));

		PartDefinition cube_r311 = Neck2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(88, 57).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1522F, -0.115F, -2.9566F, -0.2159F, -0.6017F, 0.8201F));

		PartDefinition cube_r312 = Neck2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(44, 25).addBox(2.3745F, -1.3694F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1522F, -0.115F, -2.9566F, -0.4571F, -0.4472F, 1.2936F));

		PartDefinition cube_r313 = Neck2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(68, 29).addBox(2.3745F, -1.3694F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.285F, -0.4566F, 0.0095F, -0.4353F, 1.261F));

		PartDefinition cube_r314 = Neck2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(88, 55).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.285F, -0.4566F, 0.2046F, -0.3954F, 0.7853F));

		PartDefinition cube_r315 = Neck2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(60, 37).addBox(-0.5F, -0.9302F, 4.171F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.261F, -8.2263F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = Neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2714F, -3.952F, 0.0244F, -0.1691F, -0.0508F));

		PartDefinition cube_r316 = neck4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(48, 79).addBox(0.0F, -4.06F, -1.9172F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r317 = neck4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(49, 37).mirror().addBox(-6.3745F, -1.3694F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1522F, -0.0435F, -2.0046F, -0.4976F, 0.5833F, -1.3179F));

		PartDefinition cube_r318 = neck4.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(88, 59).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1522F, -0.0435F, -2.0046F, -0.1727F, 0.7382F, -0.7975F));

		PartDefinition cube_r319 = neck4.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(88, 59).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1522F, -0.0435F, -2.0046F, -0.1727F, -0.7382F, 0.7975F));

		PartDefinition cube_r320 = neck4.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(49, 37).addBox(2.3745F, -1.3694F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1522F, -0.0435F, -2.0046F, -0.4976F, -0.5833F, 1.3179F));

		PartDefinition cube_r321 = neck4.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(27, 61).addBox(-0.5F, -0.9302F, 0.171F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neck3 = neck4.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(66, 32).addBox(-0.5F, -0.933F, -2.9772F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F))
				.texOffs(43, 79).addBox(0.0F, -4.033F, -1.9772F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -3.8F, 0.0839F, -0.2609F, -0.0217F));

		PartDefinition cube_r322 = Neck3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(61, 16).mirror().addBox(-6.3745F, -1.3694F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0522F, -0.1435F, -1.0046F, -0.5253F, 0.7139F, -1.3464F));

		PartDefinition cube_r323 = Neck3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(88, 77).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0522F, -0.1435F, -1.0046F, -0.1011F, 0.8608F, -0.7578F));

		PartDefinition cube_r324 = Neck3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(88, 77).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0522F, -0.1435F, -1.0046F, -0.1011F, -0.8608F, 0.7578F));

		PartDefinition cube_r325 = Neck3.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(61, 16).addBox(2.3745F, -1.3694F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0522F, -0.1435F, -1.0046F, -0.5253F, -0.7139F, 1.3464F));

		PartDefinition neck5 = Neck3.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(68, 24).addBox(-0.5F, -1.0F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.067F, -2.8272F, 0.0358F, -0.218F, -0.0077F));

		PartDefinition cube_r326 = neck5.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(54, 87).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -2.1F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r327 = neck5.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-6.3745F, -1.3694F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1522F, -0.2105F, -1.1774F, -0.3992F, 0.9066F, -1.2765F));

		PartDefinition cube_r328 = neck5.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(88, 79).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1522F, -0.2105F, -1.1774F, 0.2045F, 0.9598F, -0.5374F));

		PartDefinition cube_r329 = neck5.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(88, 79).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1522F, -0.2105F, -1.1774F, 0.2045F, -0.9598F, 0.5374F));

		PartDefinition cube_r330 = neck5.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(63, 0).addBox(2.3745F, -1.3694F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1522F, -0.2105F, -1.1774F, -0.3992F, -0.9066F, 1.2765F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(90, 40).addBox(-0.5F, -1.0F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0206F, -2.7692F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r331 = neck6.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(63, 2).mirror().addBox(-6.3745F, -1.3694F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1522F, -0.1899F, -1.1082F, -0.397F, 0.8516F, -1.2707F));

		PartDefinition cube_r332 = neck6.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(88, 81).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1522F, -0.1899F, -1.1082F, 0.1453F, 0.9173F, -0.5811F));

		PartDefinition cube_r333 = neck6.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(88, 81).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1522F, -0.1899F, -1.1082F, 0.1453F, -0.9173F, 0.5811F));

		PartDefinition cube_r334 = neck6.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(63, 2).addBox(2.3745F, -1.3694F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1522F, -0.1899F, -1.1082F, -0.397F, -0.8516F, 1.2707F));

		PartDefinition cube_r335 = neck6.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(49, 87).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -2.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create().texOffs(47, 61).addBox(-0.5F, -0.3757F, -3.8812F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.6331F, -2.0424F, 0.2568F, -0.1689F, -0.0441F));

		PartDefinition cube_r336 = neck7.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(29, 93).addBox(0.0F, -1.4305F, -0.9914F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3757F, -1.8812F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r337 = neck7.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(84, 21).mirror().addBox(-5.3745F, -1.3694F, -0.6081F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1522F, 0.3432F, -1.6658F, -0.4297F, 0.8399F, -1.2938F));

		PartDefinition cube_r338 = neck7.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(89, 9).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1522F, 0.3432F, -1.6658F, 0.1054F, 0.922F, -0.6115F));

		PartDefinition cube_r339 = neck7.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(89, 9).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1522F, 0.3432F, -1.6658F, 0.1054F, -0.922F, 0.6115F));

		PartDefinition cube_r340 = neck7.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(84, 21).addBox(2.3745F, -1.3694F, -0.6081F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1522F, 0.3432F, -1.6658F, -0.4297F, -0.8399F, 1.2938F));

		PartDefinition Head = neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4708F, -3.3867F, -0.2162F, 0.0F, 0.0F));

		PartDefinition cube_r341 = Head.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(97, 0).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.6258F, -6.7834F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r342 = Head.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(60, 103).addBox(-0.5F, -0.4558F, -0.7649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -0.5196F, -6.8294F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r343 = Head.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(72, 103).addBox(-0.5F, -0.5122F, -1.1517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(55, 103).addBox(-0.5F, -0.5122F, -0.9517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(0.0F, -0.5196F, -6.8294F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r344 = Head.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(42, 103).addBox(-0.5F, -0.4353F, -0.5705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(0.0F, -0.5196F, -6.8294F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r345 = Head.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(24, 98).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9395F, -5.8943F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r346 = Head.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(89, 15).addBox(-1.0F, 0.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.2027F, -5.0337F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r347 = Head.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(89, 11).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5692F, -4.1032F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r348 = Head.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(74, 53).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.8195F, -3.1351F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r349 = Head.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(74, 49).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.036F, -2.1588F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r350 = Head.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(61, 4).addBox(-2.0F, -0.3F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -0.3812F, -1.0856F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r351 = Head.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(59, 19).addBox(-2.0F, -1.0F, -1.6F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, -1.1067F, -0.5167F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r352 = Head.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(38, 61).addBox(0.025F, -4.9F, -0.8F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.025F, 1.0972F, -0.6856F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r353 = Head.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(39, 95).addBox(0.025F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-1.025F, 1.4196F, -0.1795F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r354 = Head.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(89, 72).addBox(0.025F, -1.1F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.025F, 0.7987F, -0.5028F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r355 = Head.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(0, 82).addBox(0.025F, -1.4F, -0.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.025F, 0.7987F, -0.5028F, 0.48F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.8F, 1.6697F, -3.4784F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(103, 73).addBox(-0.6F, -0.4775F, -1.1876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F))
				.texOffs(84, 103).addBox(-0.6F, -0.4775F, -0.9876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.5F, -2.2143F, -3.351F, 0.8211F, 0.1355F, 0.1587F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(89, 103).addBox(-0.6F, -0.4159F, -0.795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(-1.5F, -2.2143F, -3.351F, 0.6641F, 0.1355F, 0.1587F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(94, 103).addBox(-0.6F, -0.392F, -0.5954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.5F, -2.2143F, -3.351F, 0.5419F, 0.1355F, 0.1587F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(106, 70).addBox(1.0F, -0.3F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.625F, 0.6194F, 3.1467F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(106, 67).addBox(1.0F, 1.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(31, 73).addBox(1.0F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.625F, -0.871F, 2.9757F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(98, 19).addBox(1.0F, -1.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.625F, -1.5688F, 2.9207F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(97, 39).addBox(1.0F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, -2.238F, 2.9683F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(103, 23).addBox(-0.925F, -3.4475F, -1.3312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1554F)), PartPose.offsetAndRotation(0.25F, -2.8222F, 2.1624F, 2.7925F, 0.0873F, 0.0F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(103, 17).addBox(-1.1F, -0.8311F, -3.178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -2.8222F, 2.1624F, 1.2566F, 0.0873F, 0.0F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(103, 20).addBox(-0.925F, 1.1845F, -2.7613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.25F, -2.8222F, 2.1624F, 0.6981F, 0.0873F, 0.0F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(106, 29).addBox(-0.3623F, -0.5853F, -0.2448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(106, 13).addBox(-0.5373F, -0.5853F, -0.2448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1798F, -1.6499F, 0.8932F, 1.6394F, 0.1208F, 0.0022F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(106, 10).addBox(-0.5623F, -0.9562F, -0.7316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(106, 3).addBox(-0.5623F, -0.9562F, -0.6316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1798F, -1.6499F, 0.8932F, 2.0321F, 0.1208F, 0.0022F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(103, 105).addBox(-0.5623F, -0.4302F, -0.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1798F, -1.6499F, 0.8932F, 2.9222F, 0.1208F, 0.0022F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(105, 97).addBox(-0.5623F, 0.0343F, -0.6908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1798F, -1.6499F, 0.8932F, -2.5232F, 0.1208F, 0.0022F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(105, 91).addBox(-0.5623F, -0.1447F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1798F, -1.6499F, 0.8932F, -2.2876F, 0.1208F, 0.0022F));

		PartDefinition cube_r371 = leftFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(105, 85).addBox(-0.5623F, -0.6816F, -0.8633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1798F, -1.6499F, 0.8932F, -2.6105F, 0.1208F, 0.0022F));

		PartDefinition cube_r372 = leftFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(105, 88).addBox(-0.5583F, -0.9348F, -0.5253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(105, 61).addBox(-0.5583F, -0.9348F, -0.4253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1798F, -1.6499F, 0.8932F, -2.1817F, 0.1222F, 0.0175F));

		PartDefinition cube_r373 = leftFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(10, 104).addBox(-0.5583F, -0.4586F, -0.0251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(-0.1798F, -1.6499F, 0.8932F, -1.5184F, 0.1222F, 0.0175F));

		PartDefinition cube_r374 = leftFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(62, 89).addBox(-1.1F, 1.3223F, 0.8264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3F, -2.8222F, 2.1624F, -1.5184F, 0.0873F, 0.0F));

		PartDefinition cube_r375 = leftFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(27, 67).addBox(-1.1F, -0.849F, -2.9114F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3F, -2.8222F, 2.1624F, 0.7679F, 0.0873F, 0.0F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(51, 98).addBox(-0.903F, -1.6218F, -1.3654F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.175F, -5.2566F, 0.0517F, 1.037F, 0.1211F, 0.0446F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(39, 98).addBox(-0.903F, -1.9229F, -0.8356F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.175F, -5.2566F, 0.0517F, 1.3512F, 0.1211F, 0.0446F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(11, 95).addBox(-0.5F, -0.6191F, -0.1267F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -4.3566F, -0.2483F, 0.637F, 0.0F, 0.1309F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(95, 26).addBox(-0.5F, -0.3755F, -0.5807F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4F, -4.3566F, -0.2483F, 0.3054F, 0.0F, 0.1309F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(47, 67).addBox(-1.125F, -0.849F, -2.9114F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -2.8222F, 2.1624F, 0.3323F, 0.0651F, 0.0108F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(69, 89).addBox(-0.975F, -0.0491F, -2.0115F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0624F, -2.635F, -0.8181F, 0.3401F, 0.2356F, 0.0524F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(46, 73).addBox(-1.25F, -2.95F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.259F, -2.3601F, -2.4541F, -1.2473F, 0.1306F, 0.0092F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(34, 97).addBox(-1.25F, -1.95F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4515F, -0.9103F, -3.8182F, -0.7586F, 0.1306F, 0.0092F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(29, 98).addBox(-1.05F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9348F, -2.2329F, -3.338F, 0.3866F, 0.1425F, 0.0202F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(89, 83).addBox(-0.5F, -0.7593F, -0.1178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3507F, -2.1897F, -3.3429F, -1.0647F, 0.0F, -0.1571F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(83, 89).addBox(-0.5F, -0.8159F, -0.8396F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.2F, -1.2384F, -3.1375F, -0.6021F, 0.0F, -0.1571F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(68, 98).addBox(-0.5F, -1.1865F, -0.3365F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2F, -1.2384F, -3.1375F, -1.9809F, 0.0F, -0.1571F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(105, 94).addBox(-0.5F, -0.2502F, 0.1646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.2F, -1.2384F, -3.1375F, -2.1555F, 0.0F, -0.1571F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(103, 102).addBox(-1.075F, -1.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3F, -0.8511F, -4.6646F, -1.477F, 0.7308F, 0.0627F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(101, 67).addBox(-1.2F, -0.95F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 70).addBox(-1.075F, -0.95F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4515F, -0.9103F, -3.8182F, -1.5004F, 0.1306F, 0.0092F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(101, 35).addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2042F, 0.2118F, -4.0954F, -1.4762F, 0.7395F, 0.0638F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(75, 31).addBox(-1.0F, -0.0137F, -1.7387F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0867F, -0.1045F, -0.9907F, -1.6427F, 0.2262F, -0.0137F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(0, 104).addBox(-0.425F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 104).addBox(-0.425F, -1.4F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8453F, 0.0885F, -2.3314F, -1.5524F, 0.2353F, 0.0111F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(105, 44).addBox(-0.3F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6116F, 0.1831F, -0.5448F, -1.5187F, 0.088F, 0.0086F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(101, 64).addBox(-0.35F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4939F, -0.046F, 0.3352F, -1.4572F, 0.0432F, 0.0061F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(89, 31).addBox(-1.0F, 0.0131F, -1.8785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5359F, 0.0873F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.8F, 1.6697F, -3.4784F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(103, 73).mirror().addBox(-0.4F, -0.4775F, -1.1876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)).mirror(false)
				.texOffs(84, 103).mirror().addBox(-0.4F, -0.4775F, -0.9876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.5F, -2.2143F, -3.351F, 0.8211F, -0.1355F, -0.1587F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(89, 103).mirror().addBox(-0.4F, -0.4159F, -0.795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)).mirror(false), PartPose.offsetAndRotation(1.5F, -2.2143F, -3.351F, 0.6641F, -0.1355F, -0.1587F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(94, 103).mirror().addBox(-0.4F, -0.392F, -0.5954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.5F, -2.2143F, -3.351F, 0.5419F, -0.1355F, -0.1587F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(106, 70).mirror().addBox(-2.0F, -0.3F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.625F, 0.6194F, 3.1467F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(106, 67).mirror().addBox(-2.0F, 1.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(31, 73).mirror().addBox(-2.0F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(1.625F, -0.871F, 2.9757F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(98, 19).mirror().addBox(-2.0F, -1.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.625F, -1.5688F, 2.9207F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(97, 39).mirror().addBox(-2.0F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8F, -2.238F, 2.9683F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(103, 23).mirror().addBox(-0.075F, -3.4475F, -1.3312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1554F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -2.8222F, 2.1624F, 2.7925F, -0.0873F, 0.0F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(103, 17).mirror().addBox(0.1F, -0.8311F, -3.178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.8222F, 2.1624F, 1.2566F, -0.0873F, 0.0F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(103, 20).mirror().addBox(-0.075F, 1.1845F, -2.7613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -2.8222F, 2.1624F, 0.6981F, -0.0873F, 0.0F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(106, 29).mirror().addBox(-0.6377F, -0.5853F, -0.2448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(106, 13).mirror().addBox(-0.4627F, -0.5853F, -0.2448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1798F, -1.6499F, 0.8932F, 1.6394F, -0.1208F, -0.0022F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(106, 10).mirror().addBox(-0.4377F, -0.9562F, -0.7316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(106, 3).mirror().addBox(-0.4377F, -0.9562F, -0.6316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.1798F, -1.6499F, 0.8932F, 2.0321F, -0.1208F, -0.0022F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(103, 105).mirror().addBox(-0.4377F, -0.4302F, -0.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.1798F, -1.6499F, 0.8932F, 2.9222F, -0.1208F, -0.0022F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(105, 97).mirror().addBox(-0.4377F, 0.0343F, -0.6908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1798F, -1.6499F, 0.8932F, -2.5232F, -0.1208F, -0.0022F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(105, 91).mirror().addBox(-0.4377F, -0.1447F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.1798F, -1.6499F, 0.8932F, -2.2876F, -0.1208F, -0.0022F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(105, 85).mirror().addBox(-0.4377F, -0.6816F, -0.8633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.1798F, -1.6499F, 0.8932F, -2.6105F, -0.1208F, -0.0022F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(105, 88).mirror().addBox(-0.4417F, -0.9348F, -0.5253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(105, 61).mirror().addBox(-0.4417F, -0.9348F, -0.4253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.1798F, -1.6499F, 0.8932F, -2.1817F, -0.1222F, -0.0175F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(10, 104).mirror().addBox(-0.4417F, -0.4586F, -0.0251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(0.1798F, -1.6499F, 0.8932F, -1.5184F, -0.1222F, -0.0175F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(62, 89).mirror().addBox(0.1F, 1.3223F, 0.8264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.8222F, 2.1624F, -1.5184F, -0.0873F, 0.0F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(27, 67).mirror().addBox(0.1F, -0.849F, -2.9114F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.8222F, 2.1624F, 0.7679F, -0.0873F, 0.0F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(51, 98).mirror().addBox(-0.097F, -1.6218F, -1.3654F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.175F, -5.2566F, 0.0517F, 1.037F, -0.1211F, -0.0446F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(39, 98).mirror().addBox(-0.097F, -1.9229F, -0.8356F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.175F, -5.2566F, 0.0517F, 1.3512F, -0.1211F, -0.0446F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(11, 95).mirror().addBox(-0.5F, -0.6191F, -0.1267F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -4.3566F, -0.2483F, 0.637F, 0.0F, -0.1309F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(95, 26).mirror().addBox(-0.5F, -0.3755F, -0.5807F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.4F, -4.3566F, -0.2483F, 0.3054F, 0.0F, -0.1309F));

		PartDefinition cube_r421 = rightFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(47, 67).mirror().addBox(0.125F, -0.849F, -2.9114F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.8222F, 2.1624F, 0.3323F, -0.0651F, -0.0108F));

		PartDefinition cube_r422 = rightFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(69, 89).mirror().addBox(-0.025F, -0.0491F, -2.0115F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0624F, -2.635F, -0.8181F, 0.3401F, -0.2356F, -0.0524F));

		PartDefinition cube_r423 = rightFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(46, 73).mirror().addBox(0.25F, -2.95F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.259F, -2.3601F, -2.4541F, -1.2473F, -0.1306F, -0.0092F));

		PartDefinition cube_r424 = rightFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(34, 97).mirror().addBox(0.25F, -1.95F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4515F, -0.9103F, -3.8182F, -0.7586F, -0.1306F, -0.0092F));

		PartDefinition cube_r425 = rightFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(29, 98).mirror().addBox(0.05F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9348F, -2.2329F, -3.338F, 0.3866F, -0.1425F, -0.0202F));

		PartDefinition cube_r426 = rightFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(89, 83).mirror().addBox(-0.5F, -0.7593F, -0.1178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3507F, -2.1897F, -3.3429F, -1.0647F, 0.0F, 0.1571F));

		PartDefinition cube_r427 = rightFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(83, 89).mirror().addBox(-0.5F, -0.8159F, -0.8396F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.2F, -1.2384F, -3.1375F, -0.6021F, 0.0F, 0.1571F));

		PartDefinition cube_r428 = rightFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(68, 98).mirror().addBox(-0.5F, -1.1865F, -0.3365F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2F, -1.2384F, -3.1375F, -1.9809F, 0.0F, 0.1571F));

		PartDefinition cube_r429 = rightFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(105, 94).mirror().addBox(-0.5F, -0.2502F, 0.1646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.2F, -1.2384F, -3.1375F, -2.1555F, 0.0F, 0.1571F));

		PartDefinition cube_r430 = rightFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(103, 102).mirror().addBox(0.075F, -1.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(1.3F, -0.8511F, -4.6646F, -1.477F, -0.7308F, -0.0627F));

		PartDefinition cube_r431 = rightFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(101, 67).mirror().addBox(0.2F, -0.95F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 70).mirror().addBox(0.075F, -0.95F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4515F, -0.9103F, -3.8182F, -1.5004F, -0.1306F, -0.0092F));

		PartDefinition cube_r432 = rightFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(101, 35).mirror().addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2042F, 0.2118F, -4.0954F, -1.4762F, -0.7395F, -0.0638F));

		PartDefinition cube_r433 = rightFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(75, 31).mirror().addBox(0.0F, -0.0137F, -1.7387F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0867F, -0.1045F, -0.9907F, -1.6427F, -0.2262F, 0.0137F));

		PartDefinition cube_r434 = rightFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.575F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 104).mirror().addBox(-0.575F, -1.4F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8453F, 0.0885F, -2.3314F, -1.5524F, -0.2353F, -0.0111F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(105, 44).mirror().addBox(-0.7F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6116F, 0.1831F, -0.5448F, -1.5187F, -0.088F, -0.0086F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(101, 64).mirror().addBox(-0.65F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4939F, -0.046F, 0.3352F, -1.4572F, -0.0432F, -0.0061F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(89, 31).mirror().addBox(0.0F, 0.0131F, -1.8785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5359F, -0.0873F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5072F, -0.286F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r438 = Jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(104, 49).mirror().addBox(-0.5F, -1.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(104, 49).addBox(2.5F, -1.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5F, 0.1191F, -0.5316F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r439 = Jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(104, 76).mirror().addBox(-0.1F, -1.4166F, -1.7069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.6029F, -2.6301F, 1.5359F, -0.1571F, 0.0F));

		PartDefinition cube_r440 = Jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(104, 58).mirror().addBox(-0.1F, -0.6724F, -1.6879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(42, 106).mirror().addBox(-0.1F, -0.65F, -0.6659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.6029F, -2.6301F, 1.5708F, -0.1571F, 0.0F));

		PartDefinition cube_r441 = Jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(95, 92).mirror().addBox(-0.5F, -2.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(95, 92).addBox(2.5F, -2.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.5F, 0.1191F, -0.5316F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r442 = Jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(24, 93).mirror().addBox(-0.0629F, -2.5338F, -1.3009F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.3029F, -4.1301F, 1.3963F, -0.2269F, 0.0F));

		PartDefinition cube_r443 = Jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(90, 99).mirror().addBox(-0.0629F, -2.5159F, -1.0542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.3029F, -4.1301F, 1.501F, -0.2269F, 0.0F));

		PartDefinition cube_r444 = Jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(106, 35).mirror().addBox(-0.0629F, -0.9306F, -0.5352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.3029F, -4.1301F, 1.6581F, -0.2269F, 0.0F));

		PartDefinition cube_r445 = Jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(107, 0).mirror().addBox(-0.1F, -1.5639F, -0.6522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.6029F, -2.6301F, 1.6581F, -0.1571F, 0.0F));

		PartDefinition cube_r446 = Jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-0.0629F, -1.8191F, -0.6159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(106, 32).mirror().addBox(-0.0629F, -2.7191F, -0.5659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.3029F, -4.1301F, 1.5272F, -0.2269F, 0.0F));

		PartDefinition cube_r447 = Jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(105, 26).mirror().addBox(-0.0629F, -1.2103F, -0.3494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(104, 82).mirror().addBox(-0.0629F, -1.4103F, -0.6744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(95, 100).mirror().addBox(-0.0629F, -0.9103F, -0.6744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1622F, -0.0938F, -6.4597F, 1.6635F, -0.4094F, -0.0173F));

		PartDefinition cube_r448 = Jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(100, 90).mirror().addBox(-0.2461F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(100, 90).addBox(0.1039F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.4289F, 0.1275F, -6.833F, 1.6694F, 0.0F, 0.0F));

		PartDefinition cube_r449 = Jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(100, 26).mirror().addBox(-0.0629F, -0.9011F, -0.8942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.3029F, -4.1301F, 1.7279F, -0.2269F, 0.0F));

		PartDefinition cube_r450 = Jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(104, 79).mirror().addBox(-0.1F, -1.6981F, -0.8442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.6029F, -2.6301F, 1.7977F, -0.1571F, 0.0F));

		PartDefinition cube_r451 = Jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(104, 55).mirror().addBox(-0.1F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.6029F, -2.6301F, 1.7279F, -0.1571F, 0.0F));

		PartDefinition cube_r452 = Jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(104, 52).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false)
				.texOffs(104, 52).addBox(2.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-1.5F, -0.6309F, -1.8306F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r453 = Jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(96, 4).mirror().addBox(-0.5F, -1.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(96, 4).addBox(2.5F, -1.6F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.5F, 0.1191F, -0.5316F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r454 = Jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(34, 104).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(34, 104).addBox(2.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5F, 0.9771F, 0.096F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r455 = Jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(94, 106).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(94, 106).addBox(2.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.5F, 0.5F, 0.4F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r456 = Jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(104, 76).addBox(-0.9F, -1.4166F, -1.7069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9F, -0.6029F, -2.6301F, 1.5359F, 0.1571F, 0.0F));

		PartDefinition cube_r457 = Jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(104, 58).addBox(-0.9F, -0.6724F, -1.6879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(42, 106).addBox(-0.9F, -0.65F, -0.6659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, -0.6029F, -2.6301F, 1.5708F, 0.1571F, 0.0F));

		PartDefinition cube_r458 = Jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(24, 93).addBox(-0.9371F, -2.5338F, -1.3009F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.7F, -0.3029F, -4.1301F, 1.3963F, 0.2269F, 0.0F));

		PartDefinition cube_r459 = Jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(90, 99).addBox(-0.9371F, -2.5159F, -1.0542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.7F, -0.3029F, -4.1301F, 1.501F, 0.2269F, 0.0F));

		PartDefinition cube_r460 = Jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(106, 35).addBox(-0.9371F, -0.9306F, -0.5352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, -0.3029F, -4.1301F, 1.6581F, 0.2269F, 0.0F));

		PartDefinition cube_r461 = Jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(107, 0).addBox(-0.9F, -1.5639F, -0.6522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, -0.6029F, -2.6301F, 1.6581F, 0.1571F, 0.0F));

		PartDefinition cube_r462 = Jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(0, 107).addBox(-0.9371F, -1.8191F, -0.6159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(106, 32).addBox(-0.9371F, -2.7191F, -0.5659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, -0.3029F, -4.1301F, 1.5272F, 0.2269F, 0.0F));

		PartDefinition cube_r463 = Jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(105, 26).addBox(-0.9371F, -1.2103F, -0.3494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(104, 82).addBox(-0.9371F, -1.4103F, -0.6744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(95, 100).addBox(-0.9371F, -0.9103F, -0.6744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1622F, -0.0938F, -6.4597F, 1.6635F, 0.4094F, 0.0173F));

		PartDefinition cube_r464 = Jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(100, 26).addBox(-0.9371F, -0.9011F, -0.8942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7F, -0.3029F, -4.1301F, 1.7279F, 0.2269F, 0.0F));

		PartDefinition cube_r465 = Jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(104, 79).addBox(-0.9F, -1.6981F, -0.8442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.9F, -0.6029F, -2.6301F, 1.7977F, 0.1571F, 0.0F));

		PartDefinition cube_r466 = Jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(104, 55).addBox(-0.9F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(1.9F, -0.6029F, -2.6301F, 1.7279F, 0.1571F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}