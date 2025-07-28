package fossils.fossils.client.blockentity.model.megalosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MegalosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Leftleg1;
	private final ModelPart Leftleg2;
	private final ModelPart Leftleg3;
	private final ModelPart Leftleg4;
	private final ModelPart Leftleg5;
	private final ModelPart Rightleg1;
	private final ModelPart Rightleg2;
	private final ModelPart Rightleg3;
	private final ModelPart Rightleg4;
	private final ModelPart Rightleg5;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart bone;
	private final ModelPart leftFace2;
	private final ModelPart rightFace2;
	private final ModelPart Upperjaw;
	private final ModelPart leftFace;
	private final ModelPart Lowerjaw;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Tail9;

	public MegalosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Leftleg1 = this.Hips.getChild("Leftleg1");
		this.Leftleg2 = this.Leftleg1.getChild("Leftleg2");
		this.Leftleg3 = this.Leftleg2.getChild("Leftleg3");
		this.Leftleg4 = this.Leftleg3.getChild("Leftleg4");
		this.Leftleg5 = this.Leftleg4.getChild("Leftleg5");
		this.Rightleg1 = this.Hips.getChild("Rightleg1");
		this.Rightleg2 = this.Rightleg1.getChild("Rightleg2");
		this.Rightleg3 = this.Rightleg2.getChild("Rightleg3");
		this.Rightleg4 = this.Rightleg3.getChild("Rightleg4");
		this.Rightleg5 = this.Rightleg4.getChild("Rightleg5");
		this.bone3 = this.Hips.getChild("bone3");
		this.bone5 = this.Hips.getChild("bone5");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.Leftarm1 = this.Bodyfront.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Rightarm1 = this.Bodyfront.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.bone2 = this.Bodyfront.getChild("bone2");
		this.bone4 = this.Bodyfront.getChild("bone4");
		this.Neck1 = this.Bodyfront.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.bone = this.Head.getChild("bone");
		this.leftFace2 = this.Head.getChild("leftFace2");
		this.rightFace2 = this.Head.getChild("rightFace2");
		this.Upperjaw = this.Head.getChild("Upperjaw");
		this.leftFace = this.Upperjaw.getChild("leftFace");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Tail9 = this.Tail8.getChild("Tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -40.35F, 3.1F, 0.0663F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(56, 125).addBox(0.0F, -5.2F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7323F, 4.9287F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(41, 125).addBox(0.0F, -5.5F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8631F, 1.9316F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(124, 10).addBox(0.0F, -5.6F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.994F, -1.0656F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(36, 125).addBox(0.0F, -7.1F, 4.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 125).addBox(0.0F, -6.8F, 1.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, -1.6F, 1.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2991F, -8.1287F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftleg1 = Hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create().texOffs(103, 92).addBox(-2.0F, -1.795F, -0.8496F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.9F, 1.9F, -0.2409F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r1 = Leftleg1.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(0, 119).addBox(-0.5F, -1.5F, -0.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.705F, -1.0496F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftleg1.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(113, 54).addBox(-1.0F, -1.35F, -2.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 15.1654F, 1.6834F, -0.8552F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Leftleg1.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(103, 66).addBox(-1.5F, 0.0046F, -1.4745F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.6287F, 0.5665F, 0.4974F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Leftleg1.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(45, 119).addBox(-1.0F, -3.0475F, 0.0403F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 15.3755F, -0.719F, 0.1614F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r5 = Leftleg1.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(123, 122).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.6376F, 0.0978F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r6 = Leftleg1.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(81, 123).addBox(-1.5F, -0.1F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 10.8503F, -1.3685F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r7 = Leftleg1.addOrReplaceChild("Leftthigh_r7", CubeListBuilder.create().texOffs(0, 140).addBox(0.0F, 0.1F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.7461F, 1.9557F, -0.4538F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r8 = Leftleg1.addOrReplaceChild("Leftthigh_r8", CubeListBuilder.create().texOffs(5, 141).addBox(0.0F, -1.5F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 4.3383F, 1.8387F, 0.4538F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r9 = Leftleg1.addOrReplaceChild("Leftthigh_r9", CubeListBuilder.create().texOffs(94, 92).addBox(-2.0F, -8.0F, -1.95F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 10.8138F, 0.8189F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r10 = Leftleg1.addOrReplaceChild("Leftthigh_r10", CubeListBuilder.create().texOffs(21, 49).addBox(-2.0F, 0.1F, -0.4F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, 2.7298F, -1.0517F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 17.5271F, 1.5181F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Leftshin_r1 = Leftleg2.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(122, 46).addBox(-2.5F, -1.2F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1687F, 0.6556F, 0.4547F, -1.5708F, 1.2654F, -1.5708F));

		PartDefinition Leftshin_r2 = Leftleg2.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(137, 135).addBox(-0.8F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1687F, 2.0019F, 1.1464F, -1.5708F, 0.7069F, -1.5708F));

		PartDefinition Leftshin_r3 = Leftleg2.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(140, 5).addBox(-0.9F, -2.8883F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 4.7439F, 0.1547F, -1.5708F, 1.3614F, -1.5708F));

		PartDefinition Leftshin_r4 = Leftleg2.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(130, 139).addBox(-0.8F, -4.4883F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 4.7439F, 0.1547F, 1.5708F, 1.3439F, 1.5708F));

		PartDefinition Leftshin_r5 = Leftleg2.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(12, 137).addBox(-2.2F, 2.4117F, 0.1687F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 11.1439F, 0.1547F, -1.5708F, 1.2217F, -1.5708F));

		PartDefinition Leftshin_r6 = Leftleg2.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(24, 92).addBox(-0.9F, -4.6883F, 0.0937F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(14, 92).addBox(-1.3F, -4.6883F, 0.0937F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 5.6439F, -0.3453F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Leftshin_r7 = Leftleg2.addOrReplaceChild("Leftshin_r7", CubeListBuilder.create().texOffs(70, 125).addBox(0.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3313F, 15.7244F, -0.1817F, -1.5708F, 0.2618F, -1.5708F));

		PartDefinition Leftshin_r8 = Leftleg2.addOrReplaceChild("Leftshin_r8", CubeListBuilder.create().texOffs(124, 77).addBox(-1.5F, 1.4F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.3313F, 12.1556F, 0.8547F, -1.5708F, 0.8727F, -1.5708F));

		PartDefinition Leftshin_r9 = Leftleg2.addOrReplaceChild("Leftshin_r9", CubeListBuilder.create().texOffs(9, 123).addBox(-1.7F, -2.9883F, -1.8313F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.5F, 4.1439F, -0.1453F, 1.5708F, 1.2043F, 1.5708F));

		PartDefinition Leftshin_r10 = Leftleg2.addOrReplaceChild("Leftshin_r10", CubeListBuilder.create().texOffs(109, 122).addBox(-1.0F, 0.0117F, -1.8313F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.5F, 9.1439F, -0.4453F, -1.5708F, 1.4835F, -1.5708F));

		PartDefinition Leftshin_r11 = Leftleg2.addOrReplaceChild("Leftshin_r11", CubeListBuilder.create().texOffs(45, 85).addBox(-1.0F, -4.4883F, -1.8313F, 1.0F, 13.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 5.6439F, -0.4453F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Leftshin_r12 = Leftleg2.addOrReplaceChild("Leftshin_r12", CubeListBuilder.create().texOffs(109, 72).addBox(-2.0F, -1.1F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.3313F, 0.5944F, 0.3418F, -1.5708F, 1.3526F, -1.5708F));

		PartDefinition Leftshin_r13 = Leftleg2.addOrReplaceChild("Leftshin_r13", CubeListBuilder.create().texOffs(111, 12).addBox(-2.3F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.3313F, 1.0556F, -0.1453F, -1.5708F, 1.2217F, -1.5708F));

		PartDefinition Leftshin_r14 = Leftleg2.addOrReplaceChild("Leftshin_r14", CubeListBuilder.create().texOffs(27, 129).addBox(-0.025F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3313F, 4.1803F, 1.4851F, -1.5708F, 1.3177F, -1.5708F));

		PartDefinition Leftshin_r15 = Leftleg2.addOrReplaceChild("Leftshin_r15", CubeListBuilder.create().texOffs(7, 86).addBox(-0.525F, -6.0F, -1.0F, 1.0F, 13.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.3313F, 7.1556F, 0.8547F, -1.5708F, 1.5272F, -1.5708F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create().texOffs(0, 110).addBox(-0.9F, -0.1292F, -1.6609F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 16.3182F, -0.0942F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create().texOffs(79, 35).addBox(-3.0F, -0.5F, -3.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 6.0273F, -0.7125F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create().texOffs(56, 45).addBox(-3.0F, -0.5F, -7.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Rightleg1 = Hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create().texOffs(68, 104).addBox(-1.0F, -1.795F, -0.8496F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.9F, 1.9F, -0.2409F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r1 = Rightleg1.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(36, 119).addBox(-1.5F, -1.5F, -0.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.705F, -1.0496F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightleg1.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(71, 113).addBox(-1.0F, -1.35F, -2.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 15.1654F, 1.6834F, -0.8552F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Rightleg1.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(94, 103).addBox(-1.5F, 0.0046F, -1.4745F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.6287F, 0.5665F, 0.4974F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Rightleg1.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(54, 119).addBox(-1.0F, -3.0475F, 0.0403F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 15.3755F, -0.719F, 0.1614F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r5 = Rightleg1.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(124, 5).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.6376F, 0.0978F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r6 = Rightleg1.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(124, 0).addBox(-0.5F, -0.1F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 10.8503F, -1.3685F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r7 = Rightleg1.addOrReplaceChild("Rightthigh_r7", CubeListBuilder.create().texOffs(140, 0).addBox(-1.0F, 0.1F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.7461F, 1.9557F, -0.4538F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r8 = Rightleg1.addOrReplaceChild("Rightthigh_r8", CubeListBuilder.create().texOffs(10, 141).addBox(-1.0F, -1.5F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 4.3383F, 1.8387F, 0.4538F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r9 = Rightleg1.addOrReplaceChild("Rightthigh_r9", CubeListBuilder.create().texOffs(29, 95).addBox(0.0F, -8.0F, -1.95F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 10.8138F, 0.8189F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r10 = Rightleg1.addOrReplaceChild("Rightthigh_r10", CubeListBuilder.create().texOffs(59, 94).addBox(0.0F, 0.1F, -0.4F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0F, 2.7298F, -1.0517F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 17.5271F, 1.5181F, 0.829F, 0.0F, 0.0F));

		PartDefinition Rightshin_r1 = Rightleg2.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(122, 50).addBox(-1.5F, -1.2F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.1687F, 0.6556F, 0.4547F, -1.5708F, -1.2654F, 1.5708F));

		PartDefinition Rightshin_r2 = Rightleg2.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(138, 23).addBox(-1.2F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.1687F, 2.0019F, 1.1464F, -1.5708F, -0.7069F, 1.5708F));

		PartDefinition Rightshin_r3 = Rightleg2.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(140, 50).addBox(-0.1F, -2.8883F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 4.7439F, 0.1547F, -1.5708F, -1.3614F, 1.5708F));

		PartDefinition Rightshin_r4 = Rightleg2.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(135, 139).addBox(-0.2F, -4.4883F, 0.1687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 4.7439F, 0.1547F, 1.5708F, -1.3439F, -1.5708F));

		PartDefinition Rightshin_r5 = Rightleg2.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(137, 19).addBox(0.2F, 2.4117F, 0.1687F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 11.1439F, 0.1547F, -1.5708F, -1.2217F, 1.5708F));

		PartDefinition Rightshin_r6 = Rightleg2.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(89, 92).addBox(-0.1F, -4.6883F, 0.0937F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(19, 92).addBox(0.3F, -4.6883F, 0.0937F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 5.6439F, -0.3453F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Rightshin_r7 = Rightleg2.addOrReplaceChild("Rightshin_r7", CubeListBuilder.create().texOffs(125, 90).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3313F, 15.7244F, -0.1817F, -1.5708F, -0.2618F, 1.5708F));

		PartDefinition Rightshin_r8 = Rightleg2.addOrReplaceChild("Rightshin_r8", CubeListBuilder.create().texOffs(61, 125).addBox(-0.5F, 1.4F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.3313F, 12.1556F, 0.8547F, -1.5708F, -0.8727F, 1.5708F));

		PartDefinition Rightshin_r9 = Rightleg2.addOrReplaceChild("Rightshin_r9", CubeListBuilder.create().texOffs(18, 123).addBox(-0.3F, -2.9883F, -1.8313F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.5F, 4.1439F, -0.1453F, 1.5708F, -1.2043F, -1.5708F));

		PartDefinition Rightshin_r10 = Rightleg2.addOrReplaceChild("Rightshin_r10", CubeListBuilder.create().texOffs(116, 122).addBox(0.0F, 0.0117F, -1.8313F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.5F, 9.1439F, -0.4453F, -1.5708F, -1.4835F, 1.5708F));

		PartDefinition Rightshin_r11 = Rightleg2.addOrReplaceChild("Rightshin_r11", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, -4.4883F, -1.8313F, 1.0F, 13.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 5.6439F, -0.4453F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Rightshin_r12 = Rightleg2.addOrReplaceChild("Rightshin_r12", CubeListBuilder.create().texOffs(111, 7).addBox(-2.0F, -1.1F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.3313F, 0.5944F, 0.3418F, -1.5708F, -1.3526F, 1.5708F));

		PartDefinition Rightshin_r13 = Rightleg2.addOrReplaceChild("Rightshin_r13", CubeListBuilder.create().texOffs(111, 17).addBox(-1.7F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3313F, 1.0556F, -0.1453F, -1.5708F, -1.2217F, 1.5708F));

		PartDefinition Rightshin_r14 = Rightleg2.addOrReplaceChild("Rightshin_r14", CubeListBuilder.create().texOffs(129, 39).addBox(-0.975F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3313F, 4.1803F, 1.4851F, -1.5708F, -1.3177F, 1.5708F));

		PartDefinition Rightshin_r15 = Rightleg2.addOrReplaceChild("Rightshin_r15", CubeListBuilder.create().texOffs(52, 86).addBox(-0.475F, -6.0F, -1.0F, 1.0F, 13.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.3313F, 7.1556F, 0.8547F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create().texOffs(38, 110).addBox(-1.1F, -0.1292F, -1.6609F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 16.3182F, -0.0942F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create().texOffs(55, 79).addBox(-2.0F, -0.5F, -3.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 6.0273F, -0.7125F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create().texOffs(56, 55).addBox(-2.0F, -0.5F, -7.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 0.0F, -2.5F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.0484F, 1.6314F, 1.565F));

		PartDefinition Box_r1 = bone3.addOrReplaceChild("Box_r1", CubeListBuilder.create().texOffs(0, 49).addBox(-0.4463F, 3.8355F, -3.2979F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3332F, -3.8595F, -2.4985F, -0.1989F, 0.0233F, 0.0407F));

		PartDefinition Box_r2 = bone3.addOrReplaceChild("Box_r2", CubeListBuilder.create().texOffs(122, 72).addBox(-1.0892F, -2.9477F, 3.1766F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3332F, -3.8595F, -2.4985F, -1.2472F, -0.0114F, -0.1304F));

		PartDefinition Box_r3 = bone3.addOrReplaceChild("Box_r3", CubeListBuilder.create().texOffs(27, 115).addBox(-1.0892F, 1.0326F, -1.2069F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3332F, -3.8595F, -2.4985F, -0.6799F, -0.0114F, -0.1304F));

		PartDefinition Box_r4 = bone3.addOrReplaceChild("Box_r4", CubeListBuilder.create().texOffs(0, 64).addBox(-1.0569F, -1.1752F, -2.1889F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3332F, -3.8595F, -2.4985F, -0.3316F, 0.0F, -0.1309F));

		PartDefinition Box_r5 = bone3.addOrReplaceChild("Box_r5", CubeListBuilder.create().texOffs(32, 85).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4453F, -8.0398F, -5.083F, 0.0262F, 0.0F, -0.1309F));

		PartDefinition Box_r6 = bone3.addOrReplaceChild("Box_r6", CubeListBuilder.create().texOffs(18, 115).addBox(-0.4484F, -3.9875F, 0.0103F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.0286F, -4.479F, -9.332F, -1.0472F, 0.0F, -0.1309F));

		PartDefinition Box_r7 = bone3.addOrReplaceChild("Box_r7", CubeListBuilder.create().texOffs(116, 60).addBox(0.8516F, 0.2125F, 0.0103F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.6792F, -7.0569F, -7.732F, -0.5236F, 0.0F, -0.1309F));

		PartDefinition Box_r8 = bone3.addOrReplaceChild("Box_r8", CubeListBuilder.create().texOffs(9, 115).addBox(0.8516F, 0.2125F, -3.0897F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.8061F, -8.0211F, -4.968F, 0.3142F, 0.0F, -0.1309F));

		PartDefinition Box_r9 = bone3.addOrReplaceChild("Box_r9", CubeListBuilder.create().texOffs(71, 136).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7919F, -3.0764F, 5.7752F, -0.0698F, 0.0F, -0.1309F));

		PartDefinition Box_r10 = bone3.addOrReplaceChild("Box_r10", CubeListBuilder.create().texOffs(136, 66).addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8191F, -3.2836F, 7.7642F, 0.1047F, 0.0F, -0.1309F));

		PartDefinition Box_r11 = bone3.addOrReplaceChild("Box_r11", CubeListBuilder.create().texOffs(136, 38).addBox(-0.5F, 0.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9426F, -4.2211F, 8.0898F, -0.3316F, 0.0F, -0.1309F));

		PartDefinition Box_r12 = bone3.addOrReplaceChild("Box_r12", CubeListBuilder.create().texOffs(130, 135).addBox(-0.5F, -0.8F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.9547F, -4.3133F, 7.6881F, 0.0175F, 0.0F, -0.1309F));

		PartDefinition Box_r13 = bone3.addOrReplaceChild("Box_r13", CubeListBuilder.create().texOffs(123, 135).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.17F, -5.9485F, 7.1052F, -0.2007F, 0.0F, -0.1309F));

		PartDefinition Box_r14 = bone3.addOrReplaceChild("Box_r14", CubeListBuilder.create().texOffs(20, 129).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.2573F, -6.6121F, 5.7628F, -0.4625F, 0.0F, -0.1309F));

		PartDefinition Box_r15 = bone3.addOrReplaceChild("Box_r15", CubeListBuilder.create().texOffs(74, 79).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4468F, -8.0512F, -0.0589F, -0.2443F, 0.0F, -0.1309F));

		PartDefinition Box_r16 = bone3.addOrReplaceChild("Box_r16", CubeListBuilder.create().texOffs(88, 109).addBox(0.8516F, -3.5293F, 3.5328F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.9F, -1.5F, 0.5061F, 0.0F, -0.1309F));

		PartDefinition Box_r17 = bone3.addOrReplaceChild("Box_r17", CubeListBuilder.create().texOffs(31, 33).addBox(-0.5F, -2.0F, -11.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.793F, -3.0849F, 4.5606F, -0.0175F, 0.0F, -0.1309F));

		PartDefinition Box_r18 = bone3.addOrReplaceChild("Box_r18", CubeListBuilder.create().texOffs(45, 144).addBox(-0.056F, 5.0878F, 3.2854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.7998F, 7.9443F, -9.314F, -1.1895F, 0.0741F, -0.0137F));

		PartDefinition Box_r19 = bone3.addOrReplaceChild("Box_r19", CubeListBuilder.create().texOffs(78, 136).addBox(-0.056F, 4.1385F, 6.8201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F))
				.texOffs(5, 137).addBox(-0.056F, 4.6385F, 6.8201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.7998F, 7.9443F, -9.314F, -1.5386F, 0.0741F, -0.0137F));

		PartDefinition Box_r20 = bone3.addOrReplaceChild("Box_r20", CubeListBuilder.create().texOffs(94, 136).addBox(-0.056F, 8.0279F, 3.2313F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(-1.7998F, 7.9443F, -9.314F, -1.0586F, 0.0741F, -0.0137F));

		PartDefinition Box_r21 = bone3.addOrReplaceChild("Box_r21", CubeListBuilder.create().texOffs(131, 72).addBox(-0.056F, 7.484F, -1.729F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.093F))
				.texOffs(24, 139).addBox(-0.056F, 4.8236F, -1.1309F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7998F, 7.9443F, -9.314F, -0.535F, 0.0741F, -0.0137F));

		PartDefinition Box_r22 = bone3.addOrReplaceChild("Box_r22", CubeListBuilder.create().texOffs(133, 107).addBox(-0.056F, 0.0394F, -0.4888F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7998F, 7.9443F, -9.314F, -0.5655F, 0.0741F, -0.0137F));

		PartDefinition Box_r23 = bone3.addOrReplaceChild("Box_r23", CubeListBuilder.create().texOffs(98, 60).addBox(-0.056F, 4.8131F, -0.4606F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-1.7998F, 7.9443F, -9.314F, -0.5699F, 0.0741F, -0.0137F));

		PartDefinition Box_r24 = bone3.addOrReplaceChild("Box_r24", CubeListBuilder.create().texOffs(89, 133).addBox(-0.056F, 0.0736F, -0.8739F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.7998F, 7.9443F, -9.314F, -0.5873F, 0.0741F, -0.0137F));

		PartDefinition Box_r25 = bone3.addOrReplaceChild("Box_r25", CubeListBuilder.create().texOffs(133, 45).addBox(0.4395F, 8.9396F, 0.5844F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(139, 118).addBox(0.4395F, 10.9119F, 0.9652F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.3332F, -3.8595F, -2.4985F, -0.6256F, 0.0383F, 0.1434F));

		PartDefinition Box_r26 = bone3.addOrReplaceChild("Box_r26", CubeListBuilder.create().texOffs(139, 101).addBox(0.4395F, 7.4825F, 3.9289F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.3332F, -3.8595F, -2.4985F, -0.9048F, 0.0383F, 0.1434F));

		PartDefinition Box_r27 = bone3.addOrReplaceChild("Box_r27", CubeListBuilder.create().texOffs(22, 108).addBox(0.4395F, 2.4411F, 6.2689F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.3332F, -3.8595F, -2.4985F, -1.3412F, 0.0383F, 0.1434F));

		PartDefinition Box_r28 = bone3.addOrReplaceChild("Box_r28", CubeListBuilder.create().texOffs(76, 140).addBox(-0.9893F, 0.7193F, -1.0445F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0668F, 4.5405F, 1.4015F, -3.0883F, -0.2794F, 0.0487F));

		PartDefinition Box_r29 = bone3.addOrReplaceChild("Box_r29", CubeListBuilder.create().texOffs(133, 77).addBox(-1.0962F, -0.8719F, -0.4386F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0668F, 4.5405F, 1.4015F, -0.9576F, -0.1023F, 0.1786F));

		PartDefinition Box_r30 = bone3.addOrReplaceChild("Box_r30", CubeListBuilder.create().texOffs(40, 144).addBox(-0.9893F, -1.2579F, -1.3548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.0668F, 4.5405F, 1.4015F, -2.5822F, -0.2794F, 0.0487F));

		PartDefinition Box_r31 = bone3.addOrReplaceChild("Box_r31", CubeListBuilder.create().texOffs(133, 123).addBox(-0.9893F, -4.6548F, -1.0129F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.0668F, 4.5405F, 1.4015F, -2.1633F, -0.2794F, 0.0487F));

		PartDefinition Box_r32 = bone3.addOrReplaceChild("Box_r32", CubeListBuilder.create().texOffs(61, 130).addBox(-0.1201F, -5.8406F, 0.0261F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(91, 116).addBox(-0.1201F, -6.4405F, -1.5739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-2.0332F, 6.1405F, 5.4015F, -2.5522F, -0.0179F, 0.0468F));

		PartDefinition Box_r33 = bone3.addOrReplaceChild("Box_r33", CubeListBuilder.create().texOffs(34, 134).addBox(-0.1201F, -5.537F, -3.4775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-2.0332F, 6.1405F, 5.4015F, 3.1202F, -0.0179F, 0.0468F));

		PartDefinition Box_r34 = bone3.addOrReplaceChild("Box_r34", CubeListBuilder.create().texOffs(58, 138).addBox(-0.1201F, -3.7948F, -5.0064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(-2.0332F, 6.1405F, 5.4015F, 2.9456F, -0.0179F, 0.0468F));

		PartDefinition Box_r35 = bone3.addOrReplaceChild("Box_r35", CubeListBuilder.create().texOffs(66, 130).addBox(-0.1201F, -5.8237F, 0.0303F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0332F, 6.1405F, 5.4015F, -2.4213F, -0.0179F, 0.0468F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-2.0484F, 1.6314F, 1.565F));

		PartDefinition Box_r36 = bone5.addOrReplaceChild("Box_r36", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.5537F, 3.8355F, -3.2979F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3332F, -3.8595F, -2.4985F, -0.1989F, -0.0233F, -0.0407F));

		PartDefinition Box_r37 = bone5.addOrReplaceChild("Box_r37", CubeListBuilder.create().texOffs(122, 72).mirror().addBox(0.0892F, -2.9477F, 3.1766F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3332F, -3.8595F, -2.4985F, -1.2472F, 0.0114F, 0.1304F));

		PartDefinition Box_r38 = bone5.addOrReplaceChild("Box_r38", CubeListBuilder.create().texOffs(27, 115).mirror().addBox(0.0892F, 1.0326F, -1.2069F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3332F, -3.8595F, -2.4985F, -0.6799F, 0.0114F, 0.1304F));

		PartDefinition Box_r39 = bone5.addOrReplaceChild("Box_r39", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(0.0569F, -1.1752F, -2.1889F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3332F, -3.8595F, -2.4985F, -0.3316F, 0.0F, 0.1309F));

		PartDefinition Box_r40 = bone5.addOrReplaceChild("Box_r40", CubeListBuilder.create().texOffs(32, 85).mirror().addBox(-0.5F, 0.1F, 0.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4453F, -8.0398F, -5.083F, 0.0262F, 0.0F, 0.1309F));

		PartDefinition Box_r41 = bone5.addOrReplaceChild("Box_r41", CubeListBuilder.create().texOffs(18, 115).mirror().addBox(-0.5516F, -3.9875F, 0.0103F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.0286F, -4.479F, -9.332F, -1.0472F, 0.0F, 0.1309F));

		PartDefinition Box_r42 = bone5.addOrReplaceChild("Box_r42", CubeListBuilder.create().texOffs(116, 60).mirror().addBox(-1.8516F, 0.2125F, 0.0103F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.6792F, -7.0569F, -7.732F, -0.5236F, 0.0F, 0.1309F));

		PartDefinition Box_r43 = bone5.addOrReplaceChild("Box_r43", CubeListBuilder.create().texOffs(9, 115).mirror().addBox(-1.8516F, 0.2125F, -3.0897F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(2.8061F, -8.0211F, -4.968F, 0.3142F, 0.0F, 0.1309F));

		PartDefinition Box_r44 = bone5.addOrReplaceChild("Box_r44", CubeListBuilder.create().texOffs(71, 136).mirror().addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7919F, -3.0764F, 5.7752F, -0.0698F, 0.0F, 0.1309F));

		PartDefinition Box_r45 = bone5.addOrReplaceChild("Box_r45", CubeListBuilder.create().texOffs(136, 66).mirror().addBox(-0.5F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.8191F, -3.2836F, 7.7642F, 0.1047F, 0.0F, 0.1309F));

		PartDefinition Box_r46 = bone5.addOrReplaceChild("Box_r46", CubeListBuilder.create().texOffs(136, 38).mirror().addBox(-0.5F, 0.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.9426F, -4.2211F, 8.0898F, -0.3316F, 0.0F, 0.1309F));

		PartDefinition Box_r47 = bone5.addOrReplaceChild("Box_r47", CubeListBuilder.create().texOffs(130, 135).mirror().addBox(-0.5F, -0.8F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.9547F, -4.3133F, 7.6881F, 0.0175F, 0.0F, 0.1309F));

		PartDefinition Box_r48 = bone5.addOrReplaceChild("Box_r48", CubeListBuilder.create().texOffs(123, 135).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.17F, -5.9485F, 7.1052F, -0.2007F, 0.0F, 0.1309F));

		PartDefinition Box_r49 = bone5.addOrReplaceChild("Box_r49", CubeListBuilder.create().texOffs(20, 129).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(1.2573F, -6.6121F, 5.7628F, -0.4625F, 0.0F, 0.1309F));

		PartDefinition Box_r50 = bone5.addOrReplaceChild("Box_r50", CubeListBuilder.create().texOffs(74, 79).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.4468F, -8.0512F, -0.0589F, -0.2443F, 0.0F, 0.1309F));

		PartDefinition Box_r51 = bone5.addOrReplaceChild("Box_r51", CubeListBuilder.create().texOffs(88, 109).mirror().addBox(-1.8516F, -3.5293F, 3.5328F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, 1.9F, -1.5F, 0.5061F, 0.0F, 0.1309F));

		PartDefinition Box_r52 = bone5.addOrReplaceChild("Box_r52", CubeListBuilder.create().texOffs(31, 33).mirror().addBox(-0.5F, -2.0F, -11.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.793F, -3.0849F, 4.5606F, -0.0175F, 0.0F, 0.1309F));

		PartDefinition Box_r53 = bone5.addOrReplaceChild("Box_r53", CubeListBuilder.create().texOffs(45, 144).mirror().addBox(-0.944F, 5.0878F, 3.2854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.7998F, 7.9443F, -9.314F, -1.1895F, -0.0741F, 0.0137F));

		PartDefinition Box_r54 = bone5.addOrReplaceChild("Box_r54", CubeListBuilder.create().texOffs(78, 136).mirror().addBox(-0.944F, 4.1385F, 6.8201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)).mirror(false)
				.texOffs(5, 137).mirror().addBox(-0.944F, 4.6385F, 6.8201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.7998F, 7.9443F, -9.314F, -1.5386F, -0.0741F, 0.0137F));

		PartDefinition Box_r55 = bone5.addOrReplaceChild("Box_r55", CubeListBuilder.create().texOffs(94, 136).mirror().addBox(-0.944F, 8.0279F, 3.2313F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(1.7998F, 7.9443F, -9.314F, -1.0586F, -0.0741F, 0.0137F));

		PartDefinition Box_r56 = bone5.addOrReplaceChild("Box_r56", CubeListBuilder.create().texOffs(131, 72).mirror().addBox(-0.944F, 7.484F, -1.729F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.093F)).mirror(false)
				.texOffs(24, 139).mirror().addBox(-0.944F, 4.8236F, -1.1309F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.7998F, 7.9443F, -9.314F, -0.535F, -0.0741F, 0.0137F));

		PartDefinition Box_r57 = bone5.addOrReplaceChild("Box_r57", CubeListBuilder.create().texOffs(133, 107).mirror().addBox(-0.944F, 0.0394F, -0.4888F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.7998F, 7.9443F, -9.314F, -0.5655F, -0.0741F, 0.0137F));

		PartDefinition Box_r58 = bone5.addOrReplaceChild("Box_r58", CubeListBuilder.create().texOffs(98, 60).mirror().addBox(-0.944F, 4.8131F, -0.4606F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(1.7998F, 7.9443F, -9.314F, -0.5699F, -0.0741F, 0.0137F));

		PartDefinition Box_r59 = bone5.addOrReplaceChild("Box_r59", CubeListBuilder.create().texOffs(89, 133).mirror().addBox(-0.944F, 0.0736F, -0.8739F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.7998F, 7.9443F, -9.314F, -0.5873F, -0.0741F, 0.0137F));

		PartDefinition Box_r60 = bone5.addOrReplaceChild("Box_r60", CubeListBuilder.create().texOffs(133, 45).mirror().addBox(-1.4395F, 8.9396F, 0.5844F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(139, 118).mirror().addBox(-1.4395F, 10.9119F, 0.9652F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.3332F, -3.8595F, -2.4985F, -0.6256F, -0.0383F, -0.1434F));

		PartDefinition Box_r61 = bone5.addOrReplaceChild("Box_r61", CubeListBuilder.create().texOffs(139, 101).mirror().addBox(-1.4395F, 7.4825F, 3.9289F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.3332F, -3.8595F, -2.4985F, -0.9048F, -0.0383F, -0.1434F));

		PartDefinition Box_r62 = bone5.addOrReplaceChild("Box_r62", CubeListBuilder.create().texOffs(22, 108).mirror().addBox(-1.4395F, 2.4411F, 6.2689F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(0.3332F, -3.8595F, -2.4985F, -1.3412F, -0.0383F, -0.1434F));

		PartDefinition Box_r63 = bone5.addOrReplaceChild("Box_r63", CubeListBuilder.create().texOffs(76, 140).mirror().addBox(-0.0107F, 0.7193F, -1.0445F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0668F, 4.5405F, 1.4015F, -3.0883F, 0.2794F, -0.0487F));

		PartDefinition Box_r64 = bone5.addOrReplaceChild("Box_r64", CubeListBuilder.create().texOffs(133, 77).mirror().addBox(0.0962F, -0.8719F, -0.4386F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0668F, 4.5405F, 1.4015F, -0.9576F, 0.1023F, -0.1786F));

		PartDefinition Box_r65 = bone5.addOrReplaceChild("Box_r65", CubeListBuilder.create().texOffs(40, 144).mirror().addBox(-0.0107F, -1.2579F, -1.3548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-0.0668F, 4.5405F, 1.4015F, -2.5822F, 0.2794F, -0.0487F));

		PartDefinition Box_r66 = bone5.addOrReplaceChild("Box_r66", CubeListBuilder.create().texOffs(133, 123).mirror().addBox(-0.0107F, -4.6548F, -1.0129F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.0668F, 4.5405F, 1.4015F, -2.1633F, 0.2794F, -0.0487F));

		PartDefinition Box_r67 = bone5.addOrReplaceChild("Box_r67", CubeListBuilder.create().texOffs(61, 130).mirror().addBox(-0.8799F, -5.8406F, 0.0261F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(91, 116).mirror().addBox(-0.8799F, -6.4405F, -1.5739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(2.0332F, 6.1405F, 5.4015F, -2.5522F, 0.0179F, -0.0468F));

		PartDefinition Box_r68 = bone5.addOrReplaceChild("Box_r68", CubeListBuilder.create().texOffs(34, 134).mirror().addBox(-0.8799F, -5.537F, -3.4775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(2.0332F, 6.1405F, 5.4015F, 3.1202F, 0.0179F, -0.0468F));

		PartDefinition Box_r69 = bone5.addOrReplaceChild("Box_r69", CubeListBuilder.create().texOffs(58, 138).mirror().addBox(-0.8799F, -3.7948F, -5.0064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(2.0332F, 6.1405F, 5.4015F, 2.9456F, 0.0179F, -0.0468F));

		PartDefinition Box_r70 = bone5.addOrReplaceChild("Box_r70", CubeListBuilder.create().texOffs(66, 130).mirror().addBox(-0.8799F, -5.8237F, 0.0303F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.0332F, 6.1405F, 5.4015F, -2.4213F, 0.0179F, -0.0468F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(31, 47).addBox(-1.0F, -1.2975F, -9.8917F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.003F))
				.texOffs(44, 65).addBox(-3.5F, 13.7025F, -9.8917F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(128, 110).addBox(0.0F, -5.8974F, -5.8917F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(128, 127).addBox(0.0F, -6.1975F, -2.8917F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0009F, -7.1287F, 0.0384F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(84, 128).addBox(0.0F, -4.5F, -2.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2975F, -6.8917F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Box_r71 = Bodymiddle.addOrReplaceChild("Box_r71", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-4.0367F, -1.9075F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -1.9247F, -0.0072F, -0.0253F, -1.501F));

		PartDefinition Box_r72 = Bodymiddle.addOrReplaceChild("Box_r72", CubeListBuilder.create().texOffs(141, 98).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -1.9247F, -0.0189F, -0.0183F, -0.9773F));

		PartDefinition Box_r73 = Bodymiddle.addOrReplaceChild("Box_r73", CubeListBuilder.create().texOffs(133, 57).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -1.9247F, -0.0255F, -0.0064F, -0.4538F));

		PartDefinition Box_r74 = Bodymiddle.addOrReplaceChild("Box_r74", CubeListBuilder.create().texOffs(98, 40).mirror().addBox(-9.0367F, -1.9075F, -0.4895F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -4.9247F, 0.0109F, 0.0601F, -1.3785F));

		PartDefinition Box_r75 = Bodymiddle.addOrReplaceChild("Box_r75", CubeListBuilder.create().texOffs(140, 132).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -4.9247F, 0.0395F, 0.0466F, -0.8543F));

		PartDefinition Box_r76 = Bodymiddle.addOrReplaceChild("Box_r76", CubeListBuilder.create().texOffs(119, 31).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -4.9247F, 0.0575F, 0.0206F, -0.331F));

		PartDefinition Box_r77 = Bodymiddle.addOrReplaceChild("Box_r77", CubeListBuilder.create().texOffs(115, 40).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -7.9247F, 0.1739F, 0.0581F, -0.309F));

		PartDefinition Box_r78 = Bodymiddle.addOrReplaceChild("Box_r78", CubeListBuilder.create().texOffs(140, 116).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -7.9247F, 0.122F, 0.137F, -0.8293F));

		PartDefinition Box_r79 = Bodymiddle.addOrReplaceChild("Box_r79", CubeListBuilder.create().texOffs(82, 75).mirror().addBox(-11.0367F, -1.9075F, -0.4895F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2753F, -7.9247F, 0.0367F, 0.1796F, -1.3579F));

		PartDefinition Box_r80 = Bodymiddle.addOrReplaceChild("Box_r80", CubeListBuilder.create().texOffs(133, 57).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -1.9247F, -0.0255F, 0.0064F, 0.4538F));

		PartDefinition Box_r81 = Bodymiddle.addOrReplaceChild("Box_r81", CubeListBuilder.create().texOffs(141, 98).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -1.9247F, -0.0189F, 0.0183F, 0.9773F));

		PartDefinition Box_r82 = Bodymiddle.addOrReplaceChild("Box_r82", CubeListBuilder.create().texOffs(82, 77).addBox(2.0367F, -1.9075F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -1.9247F, -0.0072F, 0.0253F, 1.501F));

		PartDefinition Box_r83 = Bodymiddle.addOrReplaceChild("Box_r83", CubeListBuilder.create().texOffs(119, 31).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -4.9247F, 0.0575F, -0.0206F, 0.331F));

		PartDefinition Box_r84 = Bodymiddle.addOrReplaceChild("Box_r84", CubeListBuilder.create().texOffs(140, 132).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -4.9247F, 0.0395F, -0.0466F, 0.8543F));

		PartDefinition Box_r85 = Bodymiddle.addOrReplaceChild("Box_r85", CubeListBuilder.create().texOffs(98, 40).addBox(2.0367F, -1.9075F, -0.4895F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -4.9247F, 0.0109F, -0.0601F, 1.3785F));

		PartDefinition Box_r86 = Bodymiddle.addOrReplaceChild("Box_r86", CubeListBuilder.create().texOffs(115, 40).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -7.9247F, 0.1739F, -0.0581F, 0.309F));

		PartDefinition Box_r87 = Bodymiddle.addOrReplaceChild("Box_r87", CubeListBuilder.create().texOffs(140, 116).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -7.9247F, 0.122F, -0.137F, 0.8293F));

		PartDefinition Box_r88 = Bodymiddle.addOrReplaceChild("Box_r88", CubeListBuilder.create().texOffs(82, 75).addBox(2.0367F, -1.9075F, -0.4895F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2753F, -7.9247F, 0.0367F, -0.1796F, 1.3579F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 77).addBox(-1.0F, -0.6F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6975F, -9.6917F, 0.1314F, 0.0865F, 0.0114F));

		PartDefinition Bodymiddle_r2 = body.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(79, 128).addBox(0.0F, -4.3F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(123, 127).addBox(0.0F, -4.3F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -5.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Box_r89 = body.addOrReplaceChild("Box_r89", CubeListBuilder.create().texOffs(81, 46).mirror().addBox(-12.0367F, -1.9075F, -0.4895F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4222F, -0.9331F, 0.0256F, 0.1284F, -1.3422F));

		PartDefinition Box_r90 = body.addOrReplaceChild("Box_r90", CubeListBuilder.create().texOffs(140, 55).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4222F, -0.9331F, 0.0865F, 0.0984F, -0.816F));

		PartDefinition Box_r91 = body.addOrReplaceChild("Box_r91", CubeListBuilder.create().texOffs(103, 75).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4222F, -0.9331F, 0.124F, 0.0421F, -0.294F));

		PartDefinition Box_r92 = body.addOrReplaceChild("Box_r92", CubeListBuilder.create().texOffs(55, 77).mirror().addBox(-14.0367F, -1.9075F, -0.4895F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4222F, -3.9331F, 0.0367F, 0.1796F, -1.3405F));

		PartDefinition Box_r93 = body.addOrReplaceChild("Box_r93", CubeListBuilder.create().texOffs(106, 33).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4222F, -3.9331F, 0.122F, 0.137F, -0.8118F));

		PartDefinition Box_r94 = body.addOrReplaceChild("Box_r94", CubeListBuilder.create().texOffs(144, 121).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4222F, -3.9331F, 0.1739F, 0.0581F, -0.2915F));

		PartDefinition Box_r95 = body.addOrReplaceChild("Box_r95", CubeListBuilder.create().texOffs(103, 75).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4222F, -0.9331F, 0.124F, -0.0421F, 0.294F));

		PartDefinition Box_r96 = body.addOrReplaceChild("Box_r96", CubeListBuilder.create().texOffs(140, 55).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4222F, -0.9331F, 0.0865F, -0.0984F, 0.816F));

		PartDefinition Box_r97 = body.addOrReplaceChild("Box_r97", CubeListBuilder.create().texOffs(81, 46).addBox(2.0367F, -1.9075F, -0.4895F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4222F, -0.9331F, 0.0256F, -0.1284F, 1.3422F));

		PartDefinition Box_r98 = body.addOrReplaceChild("Box_r98", CubeListBuilder.create().texOffs(144, 121).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4222F, -3.9331F, 0.1739F, -0.0581F, 0.2915F));

		PartDefinition Box_r99 = body.addOrReplaceChild("Box_r99", CubeListBuilder.create().texOffs(106, 33).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4222F, -3.9331F, 0.122F, -0.137F, 0.8118F));

		PartDefinition Box_r100 = body.addOrReplaceChild("Box_r100", CubeListBuilder.create().texOffs(55, 77).addBox(2.0367F, -1.9075F, -0.4895F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4222F, -3.9331F, 0.0367F, -0.1796F, 1.3405F));

		PartDefinition Bodymiddle_r4 = body.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(67, 65).addBox(-3.0F, -4.0188F, -5.0902F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 19.2F, -2.4F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -7.15F, 0.1438F, 0.0868F, 0.0087F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(127, 102).addBox(0.0F, -4.2208F, 0.064F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7564F, -0.8706F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(133, 31).addBox(0.0F, -4.0208F, 0.064F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8872F, -3.8677F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(133, 24).addBox(0.0F, -3.8208F, -0.036F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0137F, -6.765F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(62, 24).addBox(-2.5F, -3.0F, -5.0F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 17.5657F, -1.736F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(55, 75).mirror().addBox(-12.0F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6766F, 14.5387F, -8.6443F, -0.73F, 1.0706F, 0.183F));

		PartDefinition Bodyfront_r6 = Bodyfront.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(81, 44).mirror().addBox(-10.0F, 0.0F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6766F, 14.5387F, -8.6443F, -0.7184F, 0.9771F, 0.2086F));

		PartDefinition Bodyfront_r7 = Bodyfront.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(90, 73).mirror().addBox(-8.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 13.9139F, -9.4504F, -0.4303F, 0.8883F, 0.5477F));

		PartDefinition Box_r101 = Bodyfront.addOrReplaceChild("Box_r101", CubeListBuilder.create().texOffs(74, 147).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2222F, -5.7831F, 0.2072F, 0.0686F, -0.3069F));

		PartDefinition Box_r102 = Bodyfront.addOrReplaceChild("Box_r102", CubeListBuilder.create().texOffs(143, 125).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2222F, -5.7831F, 0.1459F, 0.1627F, -0.8257F));

		PartDefinition Box_r103 = Bodyfront.addOrReplaceChild("Box_r103", CubeListBuilder.create().texOffs(79, 42).mirror().addBox(-12.0367F, -1.9075F, -0.4895F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2222F, -5.7831F, 0.0443F, 0.2137F, -1.3565F));

		PartDefinition Box_r104 = Bodyfront.addOrReplaceChild("Box_r104", CubeListBuilder.create().texOffs(69, 147).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2222F, -2.7831F, 0.1406F, 0.0474F, -0.2758F));

		PartDefinition Box_r105 = Bodyfront.addOrReplaceChild("Box_r105", CubeListBuilder.create().texOffs(143, 123).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2222F, -2.7831F, 0.0983F, 0.1113F, -0.7973F));

		PartDefinition Box_r106 = Bodyfront.addOrReplaceChild("Box_r106", CubeListBuilder.create().texOffs(33, 15).mirror().addBox(-14.0367F, -1.9075F, -0.4895F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2222F, -2.7831F, 0.0293F, 0.1454F, -1.3242F));

		PartDefinition Box_r107 = Bodyfront.addOrReplaceChild("Box_r107", CubeListBuilder.create().texOffs(147, 54).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3222F, 0.2169F, 0.1073F, 0.0367F, -0.2598F));

		PartDefinition Box_r108 = Bodyfront.addOrReplaceChild("Box_r108", CubeListBuilder.create().texOffs(143, 74).mirror().addBox(-2.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3222F, 0.2169F, 0.0747F, 0.0854F, -0.7821F));

		PartDefinition Box_r109 = Bodyfront.addOrReplaceChild("Box_r109", CubeListBuilder.create().texOffs(79, 33).mirror().addBox(-14.0367F, -1.9076F, -0.4895F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3222F, 0.2169F, 0.0219F, 0.1113F, -1.3077F));

		PartDefinition Bodyfront_r8 = Bodyfront.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(55, 75).addBox(0.0F, 0.0F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6766F, 14.5387F, -8.6443F, -0.73F, -1.0706F, -0.183F));

		PartDefinition Bodyfront_r9 = Bodyfront.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(81, 44).addBox(0.0F, 0.0F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6766F, 14.5387F, -8.6443F, -0.7184F, -0.9771F, -0.2086F));

		PartDefinition Bodyfront_r10 = Bodyfront.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(90, 73).addBox(0.0F, 0.0F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 13.9139F, -9.4504F, -0.4303F, -0.8883F, -0.5477F));

		PartDefinition Bodyfront_r11 = Bodyfront.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(116, 67).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 13.5296F, -10.9841F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r12 = Bodyfront.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(109, 49).addBox(-1.5F, 2.2F, -3.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.3997F, -8.5441F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r13 = Bodyfront.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(21, 60).addBox(-1.0F, -1.6208F, 4.864F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3274F, -12.7291F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Box_r110 = Bodyfront.addOrReplaceChild("Box_r110", CubeListBuilder.create().texOffs(79, 42).addBox(2.0367F, -1.9075F, -0.4895F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2222F, -5.7831F, 0.0443F, -0.2137F, 1.3565F));

		PartDefinition Box_r111 = Bodyfront.addOrReplaceChild("Box_r111", CubeListBuilder.create().texOffs(143, 125).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2222F, -5.7831F, 0.1459F, -0.1627F, 0.8257F));

		PartDefinition Box_r112 = Bodyfront.addOrReplaceChild("Box_r112", CubeListBuilder.create().texOffs(74, 147).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2222F, -5.7831F, 0.2072F, -0.0686F, 0.3069F));

		PartDefinition Box_r113 = Bodyfront.addOrReplaceChild("Box_r113", CubeListBuilder.create().texOffs(33, 15).addBox(2.0367F, -1.9075F, -0.4895F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2222F, -2.7831F, 0.0293F, -0.1454F, 1.3242F));

		PartDefinition Box_r114 = Bodyfront.addOrReplaceChild("Box_r114", CubeListBuilder.create().texOffs(143, 123).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2222F, -2.7831F, 0.0983F, -0.1113F, 0.7973F));

		PartDefinition Box_r115 = Bodyfront.addOrReplaceChild("Box_r115", CubeListBuilder.create().texOffs(69, 147).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2222F, -2.7831F, 0.1406F, -0.0474F, 0.2758F));

		PartDefinition Box_r116 = Bodyfront.addOrReplaceChild("Box_r116", CubeListBuilder.create().texOffs(79, 33).addBox(2.0367F, -1.9076F, -0.4895F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3222F, 0.2169F, 0.0219F, -0.1113F, 1.3077F));

		PartDefinition Box_r117 = Bodyfront.addOrReplaceChild("Box_r117", CubeListBuilder.create().texOffs(143, 74).addBox(0.7176F, -0.6336F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3222F, 0.2169F, 0.0747F, -0.0854F, 0.7821F));

		PartDefinition Box_r118 = Bodyfront.addOrReplaceChild("Box_r118", CubeListBuilder.create().texOffs(147, 54).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3222F, 0.2169F, 0.1073F, -0.0367F, 0.2598F));

		PartDefinition Leftarm1 = Bodyfront.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9421F, 9.7126F, -10.3193F, 0.4813F, 0.2264F, -0.1688F));

		PartDefinition Leftupperarm_r1 = Leftarm1.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(138, 107).addBox(-0.5F, -1.2796F, -1.0077F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.0505F, 4.0893F, 1.4467F, 0.466F, -0.0234F, -0.0062F));

		PartDefinition Leftupperarm_r2 = Leftarm1.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(88, 140).addBox(-0.5F, -1.9796F, -0.0077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.013F, 5.988F, 0.3496F, 0.0384F, -0.0234F, -0.0062F));

		PartDefinition Leftupperarm_r3 = Leftarm1.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(140, 76).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.027F, 0.3351F, 0.0069F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftarm1.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(82, 113).addBox(-0.5F, -1.025F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.027F, 2.6517F, -1.0283F, -2.1555F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r5 = Leftarm1.addOrReplaceChild("Leftupperarm_r5", CubeListBuilder.create().texOffs(145, 51).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.027F, 1.7382F, -1.435F, -1.1519F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r6 = Leftarm1.addOrReplaceChild("Leftupperarm_r6", CubeListBuilder.create().texOffs(99, 109).addBox(-0.5F, 0.1F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.027F, -0.0648F, 0.0069F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r7 = Leftarm1.addOrReplaceChild("Leftupperarm_r7", CubeListBuilder.create().texOffs(138, 27).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.027F, 0.0719F, -0.4741F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r8 = Leftarm1.addOrReplaceChild("Leftupperarm_r8", CubeListBuilder.create().texOffs(93, 140).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(68, 94).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.027F, -0.1649F, 1.4069F, -0.9163F, 0.0F, 0.0F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create().texOffs(106, 130).addBox(-0.5F, -1.1F, 0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 42).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(0.023F, 5.9669F, 0.6822F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create().texOffs(100, 7).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5433F, 4.0048F, 0.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Rightarm1 = Bodyfront.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9421F, 9.7126F, -10.3193F, 0.0886F, -0.2264F, 0.1688F));

		PartDefinition Rightupperarm_r1 = Rightarm1.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(138, 123).addBox(-0.5F, -1.2796F, -1.0077F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0505F, 4.0893F, 1.4467F, 0.466F, 0.0234F, 0.0062F));

		PartDefinition Rightupperarm_r2 = Rightarm1.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(140, 139).addBox(-0.5F, -1.9796F, -0.0077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.013F, 5.988F, 0.3496F, 0.0384F, 0.0234F, 0.0062F));

		PartDefinition Rightupperarm_r3 = Rightarm1.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(140, 128).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.027F, 0.3351F, 0.0069F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightarm1.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(144, 20).addBox(-0.5F, -1.025F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.027F, 2.6517F, -1.0283F, -2.1555F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r5 = Rightarm1.addOrReplaceChild("Rightupperarm_r5", CubeListBuilder.create().texOffs(146, 14).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.027F, 1.7382F, -1.435F, -1.1519F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r6 = Rightarm1.addOrReplaceChild("Rightupperarm_r6", CubeListBuilder.create().texOffs(111, 130).addBox(-0.5F, 0.1F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.027F, -0.0648F, 0.0069F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r7 = Rightarm1.addOrReplaceChild("Rightupperarm_r7", CubeListBuilder.create().texOffs(138, 31).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.027F, 0.0719F, -0.4741F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r8 = Rightarm1.addOrReplaceChild("Rightupperarm_r8", CubeListBuilder.create().texOffs(140, 112).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(138, 35).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.027F, -0.1649F, 1.4069F, -0.9163F, 0.0F, 0.0F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create().texOffs(118, 130).addBox(-0.5F, -1.1F, 0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 134).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(-0.023F, 5.9669F, 0.6822F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create().texOffs(100, 16).addBox(0.0F, 0.0F, -2.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5433F, 4.0048F, 0.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition bone2 = Bodyfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(4.5F, 3.1534F, -2.4243F));

		PartDefinition Box_r119 = bone2.addOrReplaceChild("Box_r119", CubeListBuilder.create().texOffs(25, 144).addBox(-0.5F, -1.9F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.9392F, 3.4985F, 0.288F, 0.0F, 0.0F));

		PartDefinition Box_r120 = bone2.addOrReplaceChild("Box_r120", CubeListBuilder.create().texOffs(109, 42).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0116F, -1.1151F, 0.7243F, 0.0F, 0.0F));

		PartDefinition Box_r121 = bone2.addOrReplaceChild("Box_r121", CubeListBuilder.create().texOffs(100, 120).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.637F, 0.0F, 0.0F));

		PartDefinition Box_r122 = bone2.addOrReplaceChild("Box_r122", CubeListBuilder.create().texOffs(91, 120).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.9316F, -3.8082F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Box_r123 = bone2.addOrReplaceChild("Box_r123", CubeListBuilder.create().texOffs(107, 107).addBox(-0.5F, 0.4F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.6349F, -4.7473F, 0.7243F, 0.0F, 0.0F));

		PartDefinition Box_r124 = bone2.addOrReplaceChild("Box_r124", CubeListBuilder.create().texOffs(115, 24).addBox(-0.5F, -0.1F, 0.05F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.0145F)), PartPose.offsetAndRotation(-3.5285F, 8.2575F, -10.6117F, 1.3849F, 0.3474F, 0.5666F));

		PartDefinition Box_r125 = bone2.addOrReplaceChild("Box_r125", CubeListBuilder.create().texOffs(0, 102).addBox(-0.5F, 0.1F, -0.05F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.5545F, 5.6555F, -12.1994F, 0.5558F, 0.3474F, 0.5666F));

		PartDefinition Box_r126 = bone2.addOrReplaceChild("Box_r126", CubeListBuilder.create().texOffs(79, 104).addBox(-0.5F, -2.9F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4034F, 5.55F, -9.673F, 0.294F, 0.3474F, 0.5666F));

		PartDefinition Box_r127 = bone2.addOrReplaceChild("Box_r127", CubeListBuilder.create().texOffs(71, 140).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2251F, -9.8466F, -0.4102F, 0.0F, 0.0F));

		PartDefinition Box_r128 = bone2.addOrReplaceChild("Box_r128", CubeListBuilder.create().texOffs(118, 98).addBox(-0.5F, -0.2F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 5.4228F, -5.9518F, -1.85F, 0.0F, 0.0F));

		PartDefinition Box_r129 = bone2.addOrReplaceChild("Box_r129", CubeListBuilder.create().texOffs(107, 100).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2251F, -9.8466F, -0.9774F, 0.0F, 0.0F));

		PartDefinition Box_r130 = bone2.addOrReplaceChild("Box_r130", CubeListBuilder.create().texOffs(118, 104).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5387F, -6.8631F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Box_r131 = bone2.addOrReplaceChild("Box_r131", CubeListBuilder.create().texOffs(133, 5).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0842F, -5.3289F, 0.288F, 0.0F, 0.0F));

		PartDefinition Box_r132 = bone2.addOrReplaceChild("Box_r132", CubeListBuilder.create().texOffs(90, 65).addBox(-0.5F, -2.0F, -0.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 4.1962F, -5.6803F, 0.637F, 0.0F, 0.0F));

		PartDefinition Box_r133 = bone2.addOrReplaceChild("Box_r133", CubeListBuilder.create().texOffs(19, 139).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9729F, 3.1079F, -12.2904F, 0.0322F, 0.3474F, 0.5666F));

		PartDefinition Box_r134 = bone2.addOrReplaceChild("Box_r134", CubeListBuilder.create().texOffs(11, 108).addBox(-0.5F, -2.0F, -0.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5061F, 0.0F, 0.0F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-4.5F, 3.1534F, -2.4243F));

		PartDefinition Box_r135 = bone4.addOrReplaceChild("Box_r135", CubeListBuilder.create().texOffs(25, 144).mirror().addBox(-0.5F, -1.9F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9392F, 3.4985F, 0.288F, 0.0F, 0.0F));

		PartDefinition Box_r136 = bone4.addOrReplaceChild("Box_r136", CubeListBuilder.create().texOffs(109, 42).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0116F, -1.1151F, 0.7243F, 0.0F, 0.0F));

		PartDefinition Box_r137 = bone4.addOrReplaceChild("Box_r137", CubeListBuilder.create().texOffs(100, 120).mirror().addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.637F, 0.0F, 0.0F));

		PartDefinition Box_r138 = bone4.addOrReplaceChild("Box_r138", CubeListBuilder.create().texOffs(91, 120).mirror().addBox(-0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9316F, -3.8082F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Box_r139 = bone4.addOrReplaceChild("Box_r139", CubeListBuilder.create().texOffs(107, 107).mirror().addBox(-0.5F, 0.4F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6349F, -4.7473F, 0.7243F, 0.0F, 0.0F));

		PartDefinition Box_r140 = bone4.addOrReplaceChild("Box_r140", CubeListBuilder.create().texOffs(115, 24).mirror().addBox(-0.5F, -0.1F, 0.05F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.0145F)).mirror(false), PartPose.offsetAndRotation(3.5285F, 8.2575F, -10.6117F, 1.3849F, -0.3474F, -0.5666F));

		PartDefinition Box_r141 = bone4.addOrReplaceChild("Box_r141", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.5F, 0.1F, -0.05F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.5545F, 5.6555F, -12.1994F, 0.5558F, -0.3474F, -0.5666F));

		PartDefinition Box_r142 = bone4.addOrReplaceChild("Box_r142", CubeListBuilder.create().texOffs(79, 104).mirror().addBox(-0.5F, -2.9F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.4034F, 5.55F, -9.673F, 0.294F, -0.3474F, -0.5666F));

		PartDefinition Box_r143 = bone4.addOrReplaceChild("Box_r143", CubeListBuilder.create().texOffs(71, 140).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2251F, -9.8466F, -0.4102F, 0.0F, 0.0F));

		PartDefinition Box_r144 = bone4.addOrReplaceChild("Box_r144", CubeListBuilder.create().texOffs(118, 98).mirror().addBox(-0.5F, -0.2F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.4228F, -5.9518F, -1.85F, 0.0F, 0.0F));

		PartDefinition Box_r145 = bone4.addOrReplaceChild("Box_r145", CubeListBuilder.create().texOffs(107, 100).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2251F, -9.8466F, -0.9774F, 0.0F, 0.0F));

		PartDefinition Box_r146 = bone4.addOrReplaceChild("Box_r146", CubeListBuilder.create().texOffs(118, 104).mirror().addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5387F, -6.8631F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Box_r147 = bone4.addOrReplaceChild("Box_r147", CubeListBuilder.create().texOffs(133, 5).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0842F, -5.3289F, 0.288F, 0.0F, 0.0F));

		PartDefinition Box_r148 = bone4.addOrReplaceChild("Box_r148", CubeListBuilder.create().texOffs(90, 65).mirror().addBox(-0.5F, -2.0F, -0.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.1962F, -5.6803F, 0.637F, 0.0F, 0.0F));

		PartDefinition Box_r149 = bone4.addOrReplaceChild("Box_r149", CubeListBuilder.create().texOffs(19, 139).mirror().addBox(-0.5F, 0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9729F, 3.1079F, -12.2904F, 0.0322F, -0.3474F, -0.5666F));

		PartDefinition Box_r150 = bone4.addOrReplaceChild("Box_r150", CubeListBuilder.create().texOffs(11, 108).mirror().addBox(-0.5F, -2.0F, -0.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5061F, 0.0F, 0.0F));

		PartDefinition Neck1 = Bodyfront.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2124F, -7.9894F, -0.2303F, 0.042F, -0.0118F));

		PartDefinition Neckbase_r1 = Neck1.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(141, 86).addBox(0.0F, -3.5F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -0.9316F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Neckbase_r2 = Neck1.addOrReplaceChild("Neckbase_r2", CubeListBuilder.create().texOffs(15, 141).addBox(0.0F, -3.2F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1563F, -1.9361F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Box_r151 = Neck1.addOrReplaceChild("Box_r151", CubeListBuilder.create().texOffs(100, 147).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1098F, -4.2937F, 0.4854F, 0.4372F, -0.5238F));

		PartDefinition Box_r152 = Neck1.addOrReplaceChild("Box_r152", CubeListBuilder.create().texOffs(111, 22).mirror().addBox(-6.7176F, -0.6336F, -0.4895F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1098F, -4.2937F, 0.1904F, 0.6163F, -1.0966F));

		PartDefinition Box_r153 = Neck1.addOrReplaceChild("Box_r153", CubeListBuilder.create().texOffs(102, 31).mirror().addBox(-7.7176F, -0.6336F, -0.4895F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0098F, -2.2937F, 0.144F, 0.5381F, -1.1219F));

		PartDefinition Box_r154 = Neck1.addOrReplaceChild("Box_r154", CubeListBuilder.create().texOffs(89, 147).mirror().addBox(-0.9383F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0098F, -2.2937F, 0.4037F, 0.3922F, -0.5568F));

		PartDefinition Box_r155 = Neck1.addOrReplaceChild("Box_r155", CubeListBuilder.create().texOffs(84, 147).mirror().addBox(-0.9383F, -0.19F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1902F, -0.2937F, 0.5363F, 0.1482F, -0.2853F));

		PartDefinition Box_r156 = Neck1.addOrReplaceChild("Box_r156", CubeListBuilder.create().texOffs(143, 143).mirror().addBox(-2.7176F, -0.6337F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1902F, -0.2937F, 0.4044F, 0.3904F, -0.7687F));

		PartDefinition Box_r157 = Neck1.addOrReplaceChild("Box_r157", CubeListBuilder.create().texOffs(83, 30).mirror().addBox(-10.0367F, -1.9076F, -0.4895F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1902F, -0.2937F, 0.1458F, 0.5369F, -1.3331F));

		PartDefinition Box_r158 = Neck1.addOrReplaceChild("Box_r158", CubeListBuilder.create().texOffs(111, 22).addBox(0.7176F, -0.6336F, -0.4895F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1098F, -4.2937F, 0.1904F, -0.6163F, 1.0966F));

		PartDefinition Box_r159 = Neck1.addOrReplaceChild("Box_r159", CubeListBuilder.create().texOffs(100, 147).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1098F, -4.2937F, 0.4854F, -0.4372F, 0.5238F));

		PartDefinition Box_r160 = Neck1.addOrReplaceChild("Box_r160", CubeListBuilder.create().texOffs(89, 147).addBox(-0.0617F, -0.1899F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0098F, -2.2937F, 0.4037F, -0.3922F, 0.5568F));

		PartDefinition Box_r161 = Neck1.addOrReplaceChild("Box_r161", CubeListBuilder.create().texOffs(102, 31).addBox(0.7176F, -0.6336F, -0.4895F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0098F, -2.2937F, 0.144F, -0.5381F, 1.1219F));

		PartDefinition Box_r162 = Neck1.addOrReplaceChild("Box_r162", CubeListBuilder.create().texOffs(83, 30).addBox(2.0367F, -1.9076F, -0.4895F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1902F, -0.2937F, 0.1458F, -0.5369F, 1.3331F));

		PartDefinition Box_r163 = Neck1.addOrReplaceChild("Box_r163", CubeListBuilder.create().texOffs(143, 143).addBox(0.7176F, -0.6337F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1902F, -0.2937F, 0.4044F, -0.3904F, 0.7687F));

		PartDefinition Box_r164 = Neck1.addOrReplaceChild("Box_r164", CubeListBuilder.create().texOffs(84, 147).addBox(-0.0617F, -0.19F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1902F, -0.2937F, 0.5363F, -0.1482F, 0.2853F));

		PartDefinition Neckbase_r3 = Neck1.addOrReplaceChild("Neckbase_r3", CubeListBuilder.create().texOffs(145, 76).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7647F, -4.9104F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neckbase_r4 = Neck1.addOrReplaceChild("Neckbase_r4", CubeListBuilder.create().texOffs(59, 86).addBox(-1.0F, -1.2F, -0.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.3859F, -4.4563F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6859F, -4.1563F, 0.0709F, 0.0F, 0.0F));

		PartDefinition Neckmiddlebase_r1 = Neck2.addOrReplaceChild("Neckmiddlebase_r1", CubeListBuilder.create().texOffs(98, 140).addBox(0.0F, -3.1F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2989F, -1.5688F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Neckmiddlebase_r2 = Neck2.addOrReplaceChild("Neckmiddlebase_r2", CubeListBuilder.create().texOffs(81, 140).addBox(0.0F, -3.4F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1371F, -4.5661F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Box_r165 = Neck2.addOrReplaceChild("Box_r165", CubeListBuilder.create().texOffs(126, 22).mirror().addBox(-3.9383F, -0.1899F, -0.4895F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1761F, -3.9374F, 0.2055F, 0.7445F, -1.0635F));

		PartDefinition Box_r166 = Neck2.addOrReplaceChild("Box_r166", CubeListBuilder.create().texOffs(147, 116).mirror().addBox(-0.9383F, -0.19F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2761F, -1.9374F, 0.5881F, 0.4875F, -0.478F));

		PartDefinition Box_r167 = Neck2.addOrReplaceChild("Box_r167", CubeListBuilder.create().texOffs(115, 88).mirror().addBox(-5.7176F, -0.6337F, -0.4895F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2761F, -1.9374F, 0.2533F, 0.7085F, -1.0578F));

		PartDefinition Box_r168 = Neck2.addOrReplaceChild("Box_r168", CubeListBuilder.create().texOffs(126, 22).addBox(-0.0617F, -0.1899F, -0.4895F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1761F, -3.9374F, 0.2055F, -0.7445F, 1.0635F));

		PartDefinition Box_r169 = Neck2.addOrReplaceChild("Box_r169", CubeListBuilder.create().texOffs(147, 116).addBox(-0.0617F, -0.19F, -0.4895F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2761F, -1.9374F, 0.5881F, -0.4875F, 0.478F));

		PartDefinition Box_r170 = Neck2.addOrReplaceChild("Box_r170", CubeListBuilder.create().texOffs(115, 88).addBox(0.7176F, -0.6337F, -0.4895F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2761F, -1.9374F, 0.2533F, -0.7085F, 1.0578F));

		PartDefinition Neckmiddlebase_r3 = Neck2.addOrReplaceChild("Neckmiddlebase_r3", CubeListBuilder.create().texOffs(96, 48).addBox(-1.0F, -1.0F, 1.9F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1243F, -6.363F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(11, 102).addBox(0.0F, -4.7951F, -2.7611F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3583F, -4.3379F, -0.222F, -0.0744F, 0.0128F));

		PartDefinition Box_r171 = Neck3.addOrReplaceChild("Box_r171", CubeListBuilder.create().texOffs(127, 70).mirror().addBox(-3.9383F, -0.1899F, -0.4895F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4344F, -2.2994F, 0.1618F, 1.0681F, -1.1718F));

		PartDefinition Box_r172 = Neck3.addOrReplaceChild("Box_r172", CubeListBuilder.create().texOffs(127, 70).addBox(-0.0617F, -0.1899F, -0.4895F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4344F, -2.2994F, 0.1618F, -1.0681F, 1.1718F));

		PartDefinition Neckmiddlefront_r1 = Neck3.addOrReplaceChild("Neckmiddlefront_r1", CubeListBuilder.create().texOffs(113, 77).addBox(-1.0F, -1.5F, 3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2275F, -5.828F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(145, 41).addBox(0.0F, -4.0788F, -4.9404F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5745F, -2.4352F, -0.2768F, 0.0F, 0.0F));

		PartDefinition Neckfront_r1 = Neck4.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(145, 46).addBox(0.0F, -2.8F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1045F, -1.948F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Box_r173 = Neck4.addOrReplaceChild("Box_r173", CubeListBuilder.create().texOffs(49, 102).mirror().addBox(-2.9383F, -0.19F, -0.4895F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1599F, -4.4643F, 0.1085F, 1.0734F, -1.2535F));

		PartDefinition Box_r174 = Neck4.addOrReplaceChild("Box_r174", CubeListBuilder.create().texOffs(128, 87).mirror().addBox(-3.9383F, -0.09F, -0.4895F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1599F, -2.4643F, 0.2316F, 1.1033F, -1.0712F));

		PartDefinition Box_r175 = Neck4.addOrReplaceChild("Box_r175", CubeListBuilder.create().texOffs(49, 102).addBox(-0.0617F, -0.19F, -0.4895F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1599F, -4.4643F, 0.1085F, -1.0734F, 1.2535F));

		PartDefinition Box_r176 = Neck4.addOrReplaceChild("Box_r176", CubeListBuilder.create().texOffs(128, 87).addBox(-0.0617F, -0.09F, -0.4895F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1599F, -2.4643F, 0.2316F, -1.1033F, 1.0712F));

		PartDefinition Neckfront_r2 = Neck4.addOrReplaceChild("Neckfront_r2", CubeListBuilder.create().texOffs(85, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2155F, -4.0711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -4.9F, 0.0372F, -0.1284F, -0.1764F));

		PartDefinition Neckfront_r3 = Neck5.addOrReplaceChild("Neckfront_r3", CubeListBuilder.create().texOffs(14, 86).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1916F, -1.7442F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neckfront_r4 = Neck5.addOrReplaceChild("Neckfront_r4", CubeListBuilder.create().texOffs(94, 144).addBox(0.0F, -3.0F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2788F, -2.7404F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Box_r177 = Neck5.addOrReplaceChild("Box_r177", CubeListBuilder.create().texOffs(132, 64).mirror().addBox(-2.9383F, -0.1899F, -0.4895F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0599F, -3.1643F, 0.1744F, 0.9322F, -1.1381F));

		PartDefinition Box_r178 = Neck5.addOrReplaceChild("Box_r178", CubeListBuilder.create().texOffs(115, 90).mirror().addBox(-2.9383F, -0.1899F, -0.4895F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0599F, -1.3643F, -0.0007F, 0.8159F, -1.4195F));

		PartDefinition Box_r179 = Neck5.addOrReplaceChild("Box_r179", CubeListBuilder.create().texOffs(132, 64).addBox(-0.0617F, -0.1899F, -0.4895F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0599F, -3.1643F, 0.1744F, -0.9322F, 1.1381F));

		PartDefinition Box_r180 = Neck5.addOrReplaceChild("Box_r180", CubeListBuilder.create().texOffs(115, 90).addBox(-0.0617F, -0.1899F, -0.4895F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0599F, -1.3643F, -0.0007F, -0.8159F, 1.4195F));

		PartDefinition Neckfront_r5 = Neck5.addOrReplaceChild("Neckfront_r5", CubeListBuilder.create().texOffs(68, 97).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2155F, -2.8711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -3.7F, 0.0458F, -0.2018F, -0.0834F));

		PartDefinition Neckfront_r6 = Neck6.addOrReplaceChild("Neckfront_r6", CubeListBuilder.create().texOffs(50, 144).addBox(0.0F, -2.6F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9052F, -0.6654F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Box_r181 = Neck6.addOrReplaceChild("Box_r181", CubeListBuilder.create().texOffs(18, 144).mirror().addBox(-1.9383F, -0.09F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0401F, -1.0643F, 0.1245F, 0.5869F, -1.2094F));

		PartDefinition Box_r182 = Neck6.addOrReplaceChild("Box_r182", CubeListBuilder.create().texOffs(18, 144).addBox(-0.0617F, -0.09F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0401F, -1.0643F, 0.1245F, -0.5869F, 1.2094F));

		PartDefinition Neckfront_r7 = Neck6.addOrReplaceChild("Neckfront_r7", CubeListBuilder.create().texOffs(114, 92).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2155F, -2.7711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create().texOffs(139, 57).addBox(0.0F, -3.026F, -1.6514F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.6F, 0.081F, 0.0F, 0.0F));

		PartDefinition Box_r183 = Neck7.addOrReplaceChild("Box_r183", CubeListBuilder.create().texOffs(144, 18).mirror().addBox(-1.9383F, -0.09F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2401F, -0.4643F, 0.1284F, 0.6301F, -1.2027F));

		PartDefinition Box_r184 = Neck7.addOrReplaceChild("Box_r184", CubeListBuilder.create().texOffs(144, 18).addBox(-0.0617F, -0.09F, -0.4895F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2401F, -0.4643F, 0.1284F, -0.6301F, 1.2027F));

		PartDefinition Neckfront_r8 = Neck7.addOrReplaceChild("Neckfront_r8", CubeListBuilder.create().texOffs(99, 114).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2155F, -2.7711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(144, 89).addBox(1.02F, -2.7423F, -1.9324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(144, 89).mirror().addBox(-2.02F, -2.7423F, -1.9324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0569F, -1.9857F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(82, 116).mirror().addBox(-2.0F, -3.7859F, -1.6785F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(82, 116).addBox(-1.0F, -3.7859F, -1.6785F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9529F, -4.7936F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(124, 24).addBox(-1.2483F, -0.0422F, -2.9511F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.7483F, -4.3343F, -0.7369F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 72).addBox(-1.7483F, -0.5662F, -1.1336F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7483F, -2.5407F, -1.3718F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 145).addBox(-1.2483F, -0.0305F, 0.0845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7483F, -4.4098F, -1.8342F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(144, 134).addBox(-1.2483F, -0.0305F, -0.4154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.7483F, -4.2804F, -2.3172F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(98, 55).addBox(-2.4947F, -1.0256F, -2.9796F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.4947F, -3.5367F, -0.04F, 1.2727F, 0.0094F, -0.0069F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(98, 35).addBox(-2.5056F, -0.9484F, -3.001F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5056F, -2.8209F, 0.5693F, 0.6793F, 0.0084F, -0.0081F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(81, 58).addBox(-2.4701F, -2.0087F, -3.988F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4701F, -4.371F, -3.5316F, 1.7265F, 0.0084F, -0.0081F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(83, 24).addBox(-2.4786F, -1.0087F, -3.988F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4786F, -4.3523F, -2.5318F, 1.552F, 0.0084F, -0.0081F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(89, 86).addBox(-2.4954F, -1.6087F, -2.988F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4955F, -3.8427F, -1.0152F, 1.2466F, 0.0084F, -0.0081F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(115, 83).addBox(-3.0F, -2.7675F, -0.0713F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 3.057F, -0.0783F, 1.405F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(44, 60).addBox(-3.0F, -2.9339F, -1.0202F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 2.557F, 0.8217F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(127, 66).addBox(-2.0F, 0.4F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.02F, 0.9759F, -1.2963F, 2.0944F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(133, 114).mirror().addBox(-1.5F, 0.45F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 114).addBox(1.54F, 0.45F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.52F, 1.7759F, -2.1963F, 1.8326F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(145, 32).mirror().addBox(-1.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(145, 32).addBox(1.54F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.52F, 2.0259F, -2.3698F, -0.4974F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(144, 100).mirror().addBox(-1.5F, -1.0F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(144, 100).addBox(1.54F, -1.0F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.52F, 1.3357F, -0.8339F, 1.5272F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(144, 92).mirror().addBox(-1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(144, 92).addBox(1.54F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.52F, 0.3389F, -3.0428F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(144, 95).mirror().addBox(-1.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(144, 95).addBox(1.54F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.52F, 1.3376F, -3.0951F, 0.8116F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(34, 139).mirror().addBox(-1.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(34, 139).addBox(1.54F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.52F, -2.2282F, -2.5899F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(39, 139).mirror().addBox(-1.5F, -0.9F, -0.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(39, 139).addBox(1.54F, -0.9F, -0.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.52F, -1.081F, -1.7717F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(89, 144).mirror().addBox(-1.5F, -1.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(89, 144).addBox(1.54F, -1.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.52F, -2.4631F, -2.3547F, -1.0297F, 0.0F, 0.0F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(145, 29).mirror().addBox(-1.5F, -0.9F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(145, 29).addBox(1.54F, -0.9F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.52F, -2.3261F, -2.57F, -0.3752F, 0.0F, 0.0F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(29, 139).mirror().addBox(-0.52F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(76, 144).mirror().addBox(-0.6F, -2.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false)
				.texOffs(84, 144).mirror().addBox(-0.76F, -2.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(84, 144).addBox(2.76F, -2.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 144).addBox(2.6F, -2.9F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(29, 139).addBox(2.52F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, -0.6255F, -3.7934F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(130, 144).mirror().addBox(-0.52F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(145, 23).mirror().addBox(-0.52F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(145, 23).addBox(2.52F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(130, 144).addBox(2.52F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.5F, -3.6283F, -4.5299F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(44, 139).mirror().addBox(-0.545F, -1.4F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(44, 139).addBox(2.545F, -1.4F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, -0.8807F, -4.7654F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(141, 14).mirror().addBox(-0.545F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(145, 26).mirror().addBox(-0.52F, -2.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(145, 26).addBox(2.52F, -2.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(141, 14).addBox(2.545F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.3065F, -3.7645F, -0.2356F, 0.0F, 0.0F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(144, 86).mirror().addBox(-0.5F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(144, 86).addBox(2.54F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.52F, -3.6063F, -3.5426F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(144, 103).mirror().addBox(-0.5F, -0.2752F, -0.8801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.645F, -2.8632F, -14.1126F, 0.2618F, -0.0175F, 0.0F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(134, 15).mirror().addBox(-0.5F, -0.3027F, -0.2846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.645F, -2.8632F, -14.1126F, 0.5934F, -0.0175F, 0.0F));

		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(5, 145).mirror().addBox(-0.5F, -0.8752F, -2.0801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(145, 3).mirror().addBox(-0.5F, -0.8752F, -1.6801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(144, 118).mirror().addBox(-0.5F, -0.8752F, -0.8801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6393F, -2.1542F, -14.4402F, 0.0F, -0.0175F, 0.0F));

		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(135, 82).mirror().addBox(-0.5F, 0.406F, -2.9126F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(145, 0).mirror().addBox(-0.5F, -0.094F, -2.4126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(134, 93).mirror().addBox(-0.5F, -0.094F, -1.8126F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.6659F, -3.9205F, -12.9141F, 0.0349F, -0.0175F, 0.0F));

		PartDefinition Head_r28 = Head.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(134, 89).mirror().addBox(-0.5F, -1.4796F, -2.3997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.645F, -2.8632F, -14.1126F, 0.5061F, -0.0175F, 0.0F));

		PartDefinition Head_r29 = Head.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(132, 59).mirror().addBox(0.0292F, -2.5509F, -2.9761F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.2598F, -6.8223F, -0.2797F, -0.0973F, 0.0362F));

		PartDefinition Head_r30 = Head.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(145, 6).mirror().addBox(0.0118F, -0.2164F, -5.9851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(10, 145).mirror().addBox(0.0118F, -1.0164F, -5.9851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.2598F, -6.8223F, -0.6113F, -0.0973F, 0.0362F));

		PartDefinition Head_r31 = Head.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(63, 119).mirror().addBox(0.0118F, -5.3784F, -2.818F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.2598F, -6.8223F, 0.3137F, -0.0973F, 0.0362F));

		PartDefinition Head_r32 = Head.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(48, 134).mirror().addBox(0.0118F, -2.1049F, -5.0538F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.2598F, -6.8223F, -0.4368F, -0.0973F, 0.0362F));

		PartDefinition Head_r33 = Head.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(72, 119).mirror().addBox(0.0292F, -3.1266F, -0.0215F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.2598F, -6.8223F, 0.8548F, -0.0973F, 0.0362F));

		PartDefinition Head_r34 = Head.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(41, 134).mirror().addBox(0.0292F, -2.1389F, -4.2977F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.2598F, -6.8223F, -1.2135F, -0.0973F, 0.0362F));

		PartDefinition Head_r35 = Head.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(97, 131).mirror().addBox(0.0292F, -4.9181F, -2.0878F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.2598F, -6.8223F, -0.1226F, -0.0973F, 0.0362F));

		PartDefinition Head_r36 = Head.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(72, 119).addBox(-1.0292F, -3.1266F, -0.0215F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.9F, 1.2598F, -6.8223F, 0.8548F, 0.0973F, -0.0362F));

		PartDefinition Head_r37 = Head.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(132, 59).addBox(-1.0292F, -2.5509F, -2.9761F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9F, 1.2598F, -6.8223F, -0.2797F, 0.0973F, -0.0362F));

		PartDefinition Head_r38 = Head.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(10, 145).addBox(-1.0118F, -1.0164F, -5.9851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(145, 6).addBox(-1.0118F, -0.2164F, -5.9851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.9F, 1.2598F, -6.8223F, -0.6113F, 0.0973F, -0.0362F));

		PartDefinition Head_r39 = Head.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(48, 134).addBox(-1.0118F, -2.1049F, -5.0538F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9F, 1.2598F, -6.8223F, -0.4368F, 0.0973F, -0.0362F));

		PartDefinition Head_r40 = Head.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(5, 145).addBox(-0.5F, -0.8752F, -2.0801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(145, 3).addBox(-0.5F, -0.8752F, -1.6801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(144, 118).addBox(-0.5F, -0.8752F, -0.8801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6393F, -2.1542F, -14.4402F, 0.0F, 0.0175F, 0.0F));

		PartDefinition Head_r41 = Head.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(135, 82).addBox(-0.5F, 0.406F, -2.9126F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F))
				.texOffs(145, 0).addBox(-0.5F, -0.094F, -2.4126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(134, 93).addBox(-0.5F, -0.094F, -1.8126F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.6659F, -3.9205F, -12.9141F, 0.0349F, 0.0175F, 0.0F));

		PartDefinition Head_r42 = Head.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(134, 89).addBox(-0.5F, -1.4796F, -2.3997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.645F, -2.8632F, -14.1126F, 0.5061F, 0.0175F, 0.0F));

		PartDefinition Head_r43 = Head.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(144, 103).addBox(-0.5F, -0.2752F, -0.8801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.645F, -2.8632F, -14.1126F, 0.2618F, 0.0175F, 0.0F));

		PartDefinition Head_r44 = Head.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(134, 15).addBox(-0.5F, -0.3027F, -0.2846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.645F, -2.8632F, -14.1126F, 0.5934F, 0.0175F, 0.0F));

		PartDefinition Head_r45 = Head.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(63, 119).addBox(-1.0118F, -5.3784F, -2.818F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9F, 1.2598F, -6.8223F, 0.3137F, 0.0973F, -0.0362F));

		PartDefinition Head_r46 = Head.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(41, 134).addBox(-1.0292F, -2.1389F, -4.2977F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.9F, 1.2598F, -6.8223F, -1.2135F, 0.0973F, -0.0362F));

		PartDefinition Head_r47 = Head.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(97, 131).addBox(-1.0292F, -4.9181F, -2.0878F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.9F, 1.2598F, -6.8223F, -0.1226F, 0.0973F, -0.0362F));

		PartDefinition Head_r48 = Head.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(85, 16).addBox(-3.0F, -3.972F, -3.026F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.0F, 2.8675F, -3.1458F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Head_r49 = Head.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(85, 8).addBox(-3.0F, -3.972F, -2.026F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0F, 2.9198F, -1.1465F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Head_r50 = Head.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(103, 60).addBox(-2.0F, -1.975F, -0.8F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4405F, -0.7423F, -0.2531F, 0.0F, 0.0F));

		PartDefinition Head_r51 = Head.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(102, 25).addBox(-3.0F, -1.5F, -1.8F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 1.2153F, 0.1455F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.0F, 1.4198F, -1.8465F));

		PartDefinition leftFace2 = Head.addOrReplaceChild("leftFace2", CubeListBuilder.create(), PartPose.offset(-0.5F, 2.1697F, 1.3889F));

		PartDefinition Head_r52 = leftFace2.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(101, 137).addBox(1.0F, 0.6591F, -1.5569F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head_r53 = leftFace2.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(71, 144).addBox(1.0F, -0.3355F, -0.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -4.1272F, -0.7251F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftFace2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(135, 144).addBox(-1.0464F, -1.0788F, -0.8103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.2483F, -6.504F, -2.1258F, 1.4522F, 0.7064F, -0.9867F));

		PartDefinition rightFace2 = Head.addOrReplaceChild("rightFace2", CubeListBuilder.create(), PartPose.offset(0.5F, 2.1697F, 1.3889F));

		PartDefinition Head_r54 = rightFace2.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(101, 137).mirror().addBox(-2.0F, 0.6591F, -1.5569F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head_r55 = rightFace2.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(71, 144).mirror().addBox(-2.0F, -0.3355F, -0.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.1272F, -0.7251F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r6 = rightFace2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(135, 144).mirror().addBox(0.0464F, -1.0788F, -0.8103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.2483F, -6.504F, -2.1258F, 1.4522F, -0.7064F, 0.9867F));

		PartDefinition Head_r56 = rightFace2.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(124, 19).mirror().addBox(-2.5F, -1.1189F, -0.8141F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.6272F, -0.4251F, 1.2217F, 0.0F, 0.0F));

		PartDefinition Upperjaw = Head.addOrReplaceChild("Upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -4.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftFace = Upperjaw.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.2F, 1.962F, -8.8692F));

		PartDefinition Upperjawslopebase_r1 = leftFace.addOrReplaceChild("Upperjawslopebase_r1", CubeListBuilder.create().texOffs(17, 82).addBox(-1.0F, -0.0226F, -0.0472F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.2F, -4.6439F, 0.092F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r1 = leftFace.addOrReplaceChild("Upperjawslopefront_r1", CubeListBuilder.create().texOffs(132, 118).addBox(-1.8F, -0.0696F, 0.5124F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(120, 40).addBox(-1.8F, -0.0696F, -1.7876F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(132, 102).addBox(-1.8F, -0.0696F, 0.0124F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.4F, -0.7477F, -5.7984F, 1.2305F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r2 = leftFace.addOrReplaceChild("Upperjawslopefront_r2", CubeListBuilder.create().texOffs(119, 116).addBox(-1.8F, -0.0002F, -0.0014F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.4F, -2.1737F, -5.3541F, 0.9425F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r3 = leftFace.addOrReplaceChild("Upperjawslopefront_r3", CubeListBuilder.create().texOffs(27, 135).addBox(-1.8F, -0.0471F, -0.9686F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4F, -4.1341F, -3.8873F, 0.9861F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r2 = leftFace.addOrReplaceChild("Upperjawslopebase_r2", CubeListBuilder.create().texOffs(60, 105).addBox(-1.0F, -0.1227F, -0.1472F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7F, -4.5867F, 6.0018F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r3 = leftFace.addOrReplaceChild("Upperjawslopebase_r3", CubeListBuilder.create().texOffs(81, 97).addBox(-1.0F, -0.1226F, -0.1472F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.7F, -4.7496F, 4.3096F, -0.096F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r4 = leftFace.addOrReplaceChild("Upperjawslopebase_r4", CubeListBuilder.create().texOffs(125, 59).addBox(-1.0F, -0.1227F, -0.1472F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7F, -4.7941F, 2.6102F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r5 = leftFace.addOrReplaceChild("Upperjawslopebase_r5", CubeListBuilder.create().texOffs(127, 95).addBox(-1.0F, -0.1227F, -0.1472F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.7F, -5.0781F, 1.6513F, -0.288F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r6 = leftFace.addOrReplaceChild("Upperjawslopebase_r6", CubeListBuilder.create().texOffs(138, 70).addBox(-1.0F, -0.1227F, -0.1472F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7F, -4.9147F, 0.9707F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r7 = leftFace.addOrReplaceChild("Upperjawslopebase_r7", CubeListBuilder.create().texOffs(90, 126).addBox(-1.0F, -0.1226F, -0.1472F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.7F, -4.9435F, -0.1289F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r8 = leftFace.addOrReplaceChild("Upperjawslopebase_r8", CubeListBuilder.create().texOffs(110, 114).addBox(-1.0F, -0.0226F, -0.0472F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7F, -4.5074F, -2.8966F, 0.192F, 0.0F, 0.0F));

		PartDefinition Upperjawslopebase_r9 = leftFace.addOrReplaceChild("Upperjawslopebase_r9", CubeListBuilder.create().texOffs(102, 77).addBox(-1.0F, -0.0226F, -0.0472F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.2F, -4.3824F, -2.8966F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Upperjawslopefront_r4 = leftFace.addOrReplaceChild("Upperjawslopefront_r4", CubeListBuilder.create().texOffs(20, 135).addBox(-1.0F, -0.0048F, -0.0113F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, -4.1882F, -3.9008F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Rightcrestbase_r1 = leftFace.addOrReplaceChild("Rightcrestbase_r1", CubeListBuilder.create().texOffs(141, 10).mirror().addBox(-0.5187F, -1.2418F, -0.171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5014F, -3.6808F, 7.3093F, -0.7088F, -0.0531F, -0.1831F));

		PartDefinition Rightcrestbase_r2 = leftFace.addOrReplaceChild("Rightcrestbase_r2", CubeListBuilder.create().texOffs(74, 89).mirror().addBox(-0.4891F, -0.1289F, -5.9319F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5457F, -4.2631F, 6.1932F, 0.0632F, -0.1026F, -0.2348F));

		PartDefinition Rightcrestbase_r3 = leftFace.addOrReplaceChild("Rightcrestbase_r3", CubeListBuilder.create().texOffs(144, 57).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6055F, -4.3415F, 7.2238F, -0.0313F, -0.0987F, -0.1708F));

		PartDefinition Rightcrestbase_r4 = leftFace.addOrReplaceChild("Rightcrestbase_r4", CubeListBuilder.create().texOffs(134, 97).mirror().addBox(-0.5187F, -0.6149F, -0.9001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5014F, -3.6808F, 7.3093F, 0.5042F, -0.0531F, -0.1831F));

		PartDefinition Leftcrestbase_r1 = leftFace.addOrReplaceChild("Leftcrestbase_r1", CubeListBuilder.create().texOffs(74, 89).addBox(-0.5109F, -0.1289F, -5.9319F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1457F, -4.2631F, 6.1932F, 0.0632F, 0.1026F, 0.2348F));

		PartDefinition Leftcrestbase_r2 = leftFace.addOrReplaceChild("Leftcrestbase_r2", CubeListBuilder.create().texOffs(144, 57).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2055F, -4.3415F, 7.2238F, -0.0313F, 0.0987F, 0.1708F));

		PartDefinition Leftcrestbase_r3 = leftFace.addOrReplaceChild("Leftcrestbase_r3", CubeListBuilder.create().texOffs(141, 10).addBox(-0.4813F, -1.2418F, -0.171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1014F, -3.6808F, 7.3093F, -0.7088F, 0.0531F, 0.1831F));

		PartDefinition Upperjawfront_r1 = leftFace.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(38, 95).mirror().addBox(0.483F, -0.4045F, -9.3526F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 1.2978F, 6.0469F, -0.096F, -0.0646F, 0.0047F));

		PartDefinition Upperjawbase_r1 = leftFace.addOrReplaceChild("Upperjawbase_r1", CubeListBuilder.create().texOffs(49, 105).mirror().addBox(0.2174F, -2.1631F, -6.4999F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 1.2978F, 6.0469F, 0.1843F, -0.0931F, 0.045F));

		PartDefinition Upperjawbase_r2 = leftFace.addOrReplaceChild("Upperjawbase_r2", CubeListBuilder.create().texOffs(81, 48).mirror().addBox(-0.4F, -1.5F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.085F, -1.9999F, 2.3485F, 0.1755F, -0.0845F, 0.0465F));

		PartDefinition Upperjawbase_r3 = leftFace.addOrReplaceChild("Upperjawbase_r3", CubeListBuilder.create().texOffs(49, 139).mirror().addBox(0.0182F, -3.4668F, -6.3008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 1.2978F, 6.0469F, -0.0251F, -0.0931F, 0.045F));

		PartDefinition Upperjawfront_r2 = leftFace.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(119, 110).mirror().addBox(0.2832F, -1.7146F, -9.2495F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 1.2978F, 6.0469F, -0.1484F, -0.0646F, 0.0047F));

		PartDefinition Upperjawbase_r4 = leftFace.addOrReplaceChild("Upperjawbase_r4", CubeListBuilder.create().texOffs(38, 101).mirror().addBox(0.0182F, -4.1827F, -5.4752F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 1.2978F, 6.0469F, -0.0775F, -0.0931F, 0.045F));

		PartDefinition Upperjawbase_r5 = leftFace.addOrReplaceChild("Upperjawbase_r5", CubeListBuilder.create().texOffs(29, 106).mirror().addBox(0.0182F, -4.8183F, -2.2803F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 1.2978F, 6.0469F, -0.2956F, -0.0931F, 0.045F));

		PartDefinition Upperjawfront_r3 = leftFace.addOrReplaceChild("Upperjawfront_r3", CubeListBuilder.create().texOffs(38, 95).addBox(-0.483F, -0.4045F, -9.3526F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.2978F, 6.0469F, -0.096F, 0.0646F, -0.0047F));

		PartDefinition Upperjawfront_r4 = leftFace.addOrReplaceChild("Upperjawfront_r4", CubeListBuilder.create().texOffs(119, 110).addBox(-1.2832F, -1.7146F, -9.2495F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7F, 1.2978F, 6.0469F, -0.1484F, 0.0646F, -0.0047F));

		PartDefinition Upperjawslopebase_r10 = leftFace.addOrReplaceChild("Upperjawslopebase_r10", CubeListBuilder.create().texOffs(89, 77).addBox(-1.0F, -0.0781F, -3.9158F, 2.0F, 4.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.2F, -4.1086F, 8.1416F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Leftcrestbase_r4 = leftFace.addOrReplaceChild("Leftcrestbase_r4", CubeListBuilder.create().texOffs(134, 97).addBox(-0.4813F, -0.6149F, -0.9001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1014F, -3.6808F, 7.3093F, 0.5042F, 0.0531F, 0.1831F));

		PartDefinition Upperjawbase_r6 = leftFace.addOrReplaceChild("Upperjawbase_r6", CubeListBuilder.create().texOffs(49, 139).addBox(-1.0182F, -3.4668F, -6.3008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.2978F, 6.0469F, -0.0251F, 0.0931F, -0.045F));

		PartDefinition Upperjawbase_r7 = leftFace.addOrReplaceChild("Upperjawbase_r7", CubeListBuilder.create().texOffs(81, 48).addBox(-0.6F, -1.5F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.315F, -1.9999F, 2.3485F, 0.1755F, 0.0845F, -0.0465F));

		PartDefinition Upperjawbase_r8 = leftFace.addOrReplaceChild("Upperjawbase_r8", CubeListBuilder.create().texOffs(49, 105).addBox(-0.2174F, -2.1631F, -6.4999F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.2978F, 6.0469F, 0.1843F, 0.0931F, -0.045F));

		PartDefinition Upperjawbase_r9 = leftFace.addOrReplaceChild("Upperjawbase_r9", CubeListBuilder.create().texOffs(38, 101).addBox(-1.0182F, -4.1827F, -5.4752F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7F, 1.2978F, 6.0469F, -0.0775F, 0.0931F, -0.045F));

		PartDefinition Upperjawbase_r10 = leftFace.addOrReplaceChild("Upperjawbase_r10", CubeListBuilder.create().texOffs(29, 106).addBox(-1.0182F, -4.8183F, -2.2803F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.2978F, 6.0469F, -0.2956F, 0.0931F, -0.045F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8231F, 0.2293F, 0.5603F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Lowerjaw.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.0526F, -0.6516F, -0.3179F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4503F, 3.4219F, -2.1933F, 0.2309F, -0.0284F, 0.0889F));

		PartDefinition cube_r8 = Lowerjaw.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(124, 34).mirror().addBox(-0.679F, -0.6665F, -0.1876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3768F, 3.376F, -4.6249F, -0.0284F, -0.1839F, 0.0661F));

		PartDefinition cube_r9 = Lowerjaw.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(124, 29).mirror().addBox(0.0687F, -0.6352F, -0.3719F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3768F, 2.776F, -6.8249F, -0.2452F, -0.3141F, 0.0057F));

		PartDefinition Lowerjawslopebase_r1 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r1", CubeListBuilder.create().texOffs(125, 146).mirror().addBox(-2.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(125, 146).addBox(0.3F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6F, 0.05F, 1.0523F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r2 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r2", CubeListBuilder.create().texOffs(35, 144).mirror().addBox(-2.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 144).addBox(0.3F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 2.5076F, -7.1869F, -0.096F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r3 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r3", CubeListBuilder.create().texOffs(30, 144).mirror().addBox(-2.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(30, 144).addBox(0.3F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.6F, 2.5164F, -6.1869F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r4 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r4", CubeListBuilder.create().texOffs(111, 135).mirror().addBox(-2.525F, -1.7F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 52).mirror().addBox(-2.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(111, 135).addBox(0.325F, -1.7F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(133, 52).addBox(0.3F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6F, 2.2726F, -4.2019F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r5 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r5", CubeListBuilder.create().texOffs(134, 10).mirror().addBox(-2.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(134, 10).addBox(0.3F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.8568F, -2.2456F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r6 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r6", CubeListBuilder.create().texOffs(120, 146).mirror().addBox(-2.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(120, 146).addBox(0.3F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.5312F, -1.3F, 0.3316F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r7 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r7", CubeListBuilder.create().texOffs(126, 82).mirror().addBox(-2.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(126, 82).addBox(0.3F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6F, 1.628F, -1.6882F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r8 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r8", CubeListBuilder.create().texOffs(60, 112).mirror().addBox(0.1F, 1.1112F, -3.4074F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.6944F, -7.8289F, 0.0175F, -0.1396F, 0.0F));

		PartDefinition Lowerjawslopebase_r9 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r9", CubeListBuilder.create().texOffs(133, 0).mirror().addBox(-1.0053F, 0.0175F, -2.0174F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.4056F, -14.8289F, -0.0524F, 0.0349F, 0.0F));

		PartDefinition Lowerjawslopebase_r10 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r10", CubeListBuilder.create().texOffs(47, 113).mirror().addBox(0.1F, 2.1778F, -7.3197F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.6944F, -7.8289F, -0.0087F, -0.1396F, 0.0F));

		PartDefinition Lowerjawslopebase_r11 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r11", CubeListBuilder.create().texOffs(146, 70).mirror().addBox(-1.0053F, 1.9204F, -0.8665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(138, 46).mirror().addBox(-1.0053F, 2.3205F, -1.2665F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.4056F, -14.8289F, -1.1083F, 0.0349F, 0.0F));

		PartDefinition Lowerjawslopebase_r12 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r12", CubeListBuilder.create().texOffs(6, 148).mirror().addBox(-0.7054F, -1.1834F, -3.4053F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(138, 42).mirror().addBox(-1.0053F, 0.0166F, -3.4053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.4056F, -14.8289F, -0.192F, 0.0349F, 0.0F));

		PartDefinition Lowerjawslopebase_r13 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r13", CubeListBuilder.create().texOffs(3, 148).mirror().addBox(-0.7054F, -1.6223F, -1.5753F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(133, 130).mirror().addBox(-1.0053F, -0.1223F, -1.5753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.4056F, -14.8289F, -0.1047F, 0.0349F, 0.0F));

		PartDefinition Lowerjawslopebase_r14 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r14", CubeListBuilder.create().texOffs(71, 130).mirror().addBox(0.4F, 0.391F, -6.9242F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.6944F, -7.8289F, -0.1047F, -0.1396F, 0.0F));

		PartDefinition Lowerjawslopebase_r15 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r15", CubeListBuilder.create().texOffs(104, 85).mirror().addBox(0.1F, 0.8317F, -7.3126F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.6944F, -7.8289F, 0.0262F, -0.1396F, 0.0F));

		PartDefinition Lowerjawslopebase_r16 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r16", CubeListBuilder.create().texOffs(36, 148).mirror().addBox(0.4F, 0.2059F, -3.4807F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.6944F, -7.8289F, -0.0262F, -0.1396F, 0.0F));

		PartDefinition Lowerjawslopebase_r17 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r17", CubeListBuilder.create().texOffs(113, 33).mirror().addBox(0.1F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.6944F, -7.8289F, 0.2356F, -0.1396F, 0.0F));

		PartDefinition Lowerjawslopebase_r18 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r18", CubeListBuilder.create().texOffs(113, 0).mirror().addBox(-2.5F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(113, 0).addBox(0.3F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6F, -0.7642F, -3.8295F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r19 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r19", CubeListBuilder.create().texOffs(27, 123).mirror().addBox(-2.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(27, 123).addBox(0.3F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6F, -0.5549F, -0.8368F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopebase_r20 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r20", CubeListBuilder.create().texOffs(124, 54).mirror().addBox(-2.5F, -0.8F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(97, 126).mirror().addBox(-2.5F, 0.0F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(124, 54).addBox(0.3F, -0.8F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F))
				.texOffs(97, 126).addBox(0.3F, 0.0F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.2722F, 0.8395F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Lowerjaw.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(100, 0).addBox(0.0526F, -0.6516F, -0.3179F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4503F, 3.4219F, -2.1933F, 0.2309F, 0.0284F, -0.0889F));

		PartDefinition cube_r11 = Lowerjaw.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(124, 34).addBox(-0.321F, -0.6665F, -0.1876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3768F, 3.376F, -4.6249F, -0.0284F, 0.1839F, -0.0661F));

		PartDefinition cube_r12 = Lowerjaw.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(124, 29).addBox(-1.0687F, -0.6352F, -0.3719F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3768F, 2.776F, -6.8249F, -0.2452F, 0.3141F, -0.0057F));

		PartDefinition Lowerjawslopebase_r21 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r21", CubeListBuilder.create().texOffs(60, 112).addBox(-1.1F, 1.1112F, -3.4074F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0F, -0.6944F, -7.8289F, 0.0175F, 0.1396F, 0.0F));

		PartDefinition Lowerjawslopebase_r22 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r22", CubeListBuilder.create().texOffs(133, 0).addBox(0.0054F, 0.0175F, -2.0174F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.4056F, -14.8289F, -0.0524F, -0.0349F, 0.0F));

		PartDefinition Lowerjawslopebase_r23 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r23", CubeListBuilder.create().texOffs(47, 113).addBox(-1.1F, 2.1778F, -7.3197F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0F, -0.6944F, -7.8289F, -0.0087F, 0.1396F, 0.0F));

		PartDefinition Lowerjawslopebase_r24 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r24", CubeListBuilder.create().texOffs(146, 70).addBox(0.0054F, 1.9204F, -0.8665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(138, 46).addBox(0.0054F, 2.3205F, -1.2665F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1F, 0.4056F, -14.8289F, -1.1083F, -0.0349F, 0.0F));

		PartDefinition Lowerjawslopebase_r25 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r25", CubeListBuilder.create().texOffs(6, 148).addBox(0.7054F, -1.1834F, -3.4053F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 42).addBox(0.0054F, 0.0166F, -3.4053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1F, 0.4056F, -14.8289F, -0.192F, -0.0349F, 0.0F));

		PartDefinition Lowerjawslopebase_r26 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r26", CubeListBuilder.create().texOffs(3, 148).addBox(0.7054F, -1.6223F, -1.5753F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 130).addBox(0.0054F, -0.1223F, -1.5753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1F, 0.4056F, -14.8289F, -0.1047F, -0.0349F, 0.0F));

		PartDefinition Lowerjawslopebase_r27 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r27", CubeListBuilder.create().texOffs(71, 130).addBox(-0.4F, 0.391F, -6.9242F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.6944F, -7.8289F, -0.1047F, 0.1396F, 0.0F));

		PartDefinition Lowerjawslopebase_r28 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r28", CubeListBuilder.create().texOffs(104, 85).addBox(-1.1F, 0.8317F, -7.3126F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.6944F, -7.8289F, 0.0262F, 0.1396F, 0.0F));

		PartDefinition Lowerjawslopebase_r29 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r29", CubeListBuilder.create().texOffs(36, 148).addBox(-0.4F, 0.2059F, -3.4807F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.6944F, -7.8289F, -0.0262F, 0.1396F, 0.0F));

		PartDefinition Lowerjawslopebase_r30 = Lowerjaw.addOrReplaceChild("Lowerjawslopebase_r30", CubeListBuilder.create().texOffs(113, 33).addBox(-1.1F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.0F, -0.6944F, -7.8289F, 0.2356F, 0.1396F, 0.0F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(33, 0).addBox(-1.0F, -1.4074F, -0.0052F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7991F, 6.8213F, -0.1019F, 0.0913F, 0.0344F));

		PartDefinition Tailbase_r1 = Tail1.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(10, 129).addBox(0.0F, -4.9F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4074F, 9.9948F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tail1.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(5, 129).addBox(0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4074F, 6.9948F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tail1.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(51, 125).addBox(0.0F, -5.3F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4074F, 3.9948F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tail1.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(55, 134).addBox(0.0F, -6.1F, 0.4F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3609F, 11.8997F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tail1.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(17, 64).addBox(0.0F, 0.9F, 1.4F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 139).addBox(0.0F, -0.1F, -0.6F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.54F, 5.6453F, 0.4625F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tail1.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(63, 146).mirror().addBox(1.2F, -2.7F, 7.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 146).mirror().addBox(1.2F, -2.8F, 4.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 146).mirror().addBox(1.2F, -3.0F, -1.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 146).mirror().addBox(1.2F, -2.9F, 1.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8229F, 3.2916F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Tailbase_r7 = Tail1.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(63, 146).addBox(-1.2F, -3.0F, -1.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 146).addBox(-1.2F, -2.7F, 7.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 146).addBox(-1.2F, -2.8F, 4.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 146).addBox(-1.2F, -2.9F, 1.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8229F, 3.2916F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Tailbase_r8 = Tail1.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(63, 146).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8229F, 3.2916F, 0.6021F, 0.0F, 0.0F));

		PartDefinition Tailbase_r9 = Tail1.addOrReplaceChild("Tailbase_r9", CubeListBuilder.create().texOffs(46, 125).addBox(0.0F, -5.2F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4074F, 0.9948F, -0.096F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -1.1028F, -0.075F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3075F, 11.9948F, 0.0303F, 0.1305F, 0.0096F));

		PartDefinition Tailmiddlebase_r1 = Tail2.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(101, 141).addBox(0.0F, -3.9F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1028F, 10.925F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tail2.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(141, 92).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1028F, 8.925F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r3 = Tail2.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(111, 139).addBox(0.0F, -4.3F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0028F, 6.925F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailbase_r10 = Tail2.addOrReplaceChild("Tailbase_r10", CubeListBuilder.create().texOffs(65, 138).addBox(0.0F, -3.0F, 8.4F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 139).addBox(0.0F, -0.9F, 12.4F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 137).addBox(0.0F, -2.3F, 10.4F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 137).addBox(0.0F, -3.7F, 6.4F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 136).addBox(0.0F, -4.5F, 4.4F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6684F, -0.0951F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tailbase_r11 = Tail2.addOrReplaceChild("Tailbase_r11", CubeListBuilder.create().texOffs(68, 138).mirror().addBox(1.0F, -1.9F, 10.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 138).mirror().addBox(1.0F, -2.1F, 8.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 138).mirror().addBox(1.0F, -2.3F, 6.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 138).mirror().addBox(1.0F, -2.4F, 4.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 138).mirror().addBox(1.0F, -2.6F, 1.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9427F, 0.0324F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Tailbase_r12 = Tail2.addOrReplaceChild("Tailbase_r12", CubeListBuilder.create().texOffs(68, 138).addBox(-1.0F, -1.9F, 10.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 138).addBox(-1.0F, -2.1F, 8.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 138).addBox(-1.0F, -2.3F, 6.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 138).addBox(-1.0F, -2.4F, 4.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 138).addBox(-1.0F, -2.6F, 1.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9427F, 0.0324F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Tailbase_r13 = Tail2.addOrReplaceChild("Tailbase_r13", CubeListBuilder.create().texOffs(68, 138).addBox(0.0F, -0.3F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9427F, 0.0324F, 0.3403F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r4 = Tail2.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(15, 129).addBox(0.0F, -4.5F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1028F, 3.925F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r5 = Tail2.addOrReplaceChild("Tailmiddlebase_r5", CubeListBuilder.create().texOffs(129, 10).addBox(0.0F, -4.8F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1028F, 0.925F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 33).addBox(-1.0F, -1.4296F, -0.2797F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2933F, 13.1973F, 0.0654F, 0.0872F, 0.0019F));

		PartDefinition Tailmiddle_r1 = Tail3.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(107, 145).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4296F, 11.7203F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r2 = Tail3.addOrReplaceChild("Tailmiddle_r2", CubeListBuilder.create().texOffs(145, 81).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4296F, 9.7203F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r3 = Tail3.addOrReplaceChild("Tailmiddle_r3", CubeListBuilder.create().texOffs(142, 80).addBox(0.0F, -3.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4296F, 7.7203F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r4 = Tail3.addOrReplaceChild("Tailmiddle_r4", CubeListBuilder.create().texOffs(60, 142).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4296F, 5.7203F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r5 = Tail3.addOrReplaceChild("Tailmiddle_r5", CubeListBuilder.create().texOffs(57, 142).addBox(0.0F, -3.5F, 0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4296F, 3.6203F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r6 = Tail3.addOrReplaceChild("Tailmiddle_r6", CubeListBuilder.create().texOffs(54, 142).addBox(0.0F, -3.6F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4296F, 1.7203F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r7 = Tail3.addOrReplaceChild("Tailmiddle_r7", CubeListBuilder.create().texOffs(104, 141).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4296F, -0.2797F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailbase_r14 = Tail3.addOrReplaceChild("Tailbase_r14", CubeListBuilder.create().texOffs(143, 106).addBox(0.0F, 3.8F, 24.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 68).addBox(0.0F, 3.2F, 22.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 62).addBox(0.0F, 2.5F, 20.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 35).addBox(0.0F, 1.9F, 18.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 139).addBox(0.0F, 0.2F, 16.4F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 139).addBox(0.0F, -0.4F, 14.4F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3751F, -13.2924F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(31, 17).addBox(-1.0F, -1.0054F, 0.0268F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.4326F, 12.6838F, 0.1031F, 0.1309F, 0.0021F));

		PartDefinition Tailmiddleend_r1 = Tail4.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(18, 146).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0054F, 11.0268F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r2 = Tail4.addOrReplaceChild("Tailmiddleend_r2", CubeListBuilder.create().texOffs(146, 9).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0054F, 9.0268F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r3 = Tail4.addOrReplaceChild("Tailmiddleend_r3", CubeListBuilder.create().texOffs(143, 145).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0054F, 7.0268F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r4 = Tail4.addOrReplaceChild("Tailmiddleend_r4", CubeListBuilder.create().texOffs(145, 137).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0054F, 5.0268F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r5 = Tail4.addOrReplaceChild("Tailmiddleend_r5", CubeListBuilder.create().texOffs(145, 127).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0054F, 3.0268F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r6 = Tail4.addOrReplaceChild("Tailmiddleend_r6", CubeListBuilder.create().texOffs(117, 145).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0054F, 1.0268F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailbase_r15 = Tail4.addOrReplaceChild("Tailbase_r15", CubeListBuilder.create().texOffs(146, 106).addBox(0.0F, 8.6F, 36.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 146).addBox(0.0F, 7.9F, 34.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 146).addBox(0.0F, 7.3F, 32.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 146).addBox(0.0F, 6.6F, 30.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 65).addBox(0.0F, 6.0F, 28.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(140, 143).addBox(0.0F, 4.4F, 26.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8077F, -25.9762F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(56, 33).addBox(-0.5F, -1.0015F, -0.043F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0059F, 12.947F, -0.0833F, -0.1739F, 0.0144F));

		PartDefinition Tailendbase_r1 = Tail5.addOrReplaceChild("Tailendbase_r1", CubeListBuilder.create().texOffs(128, 118).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0015F, 7.957F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tailendbase_r2 = Tail5.addOrReplaceChild("Tailendbase_r2", CubeListBuilder.create().texOffs(106, 126).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0015F, 5.957F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailendbase_r3 = Tail5.addOrReplaceChild("Tailendbase_r3", CubeListBuilder.create().texOffs(146, 60).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0015F, 3.957F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailendbase_r4 = Tail5.addOrReplaceChild("Tailendbase_r4", CubeListBuilder.create().texOffs(146, 35).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0015F, 1.957F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailbase_r16 = Tail5.addOrReplaceChild("Tailbase_r16", CubeListBuilder.create().texOffs(15, 147).addBox(0.0F, 13.1F, 46.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 125).addBox(0.0F, 12.4F, 44.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 146).addBox(0.0F, 10.7F, 42.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 111).addBox(0.0F, 10.0F, 40.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 146).addBox(0.0F, 9.3F, 38.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8137F, -38.9231F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tailendbase_r5 = Tail5.addOrReplaceChild("Tailendbase_r5", CubeListBuilder.create().texOffs(21, 146).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0015F, -0.043F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, -0.5423F, -0.3842F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.4089F, 10.1684F, -0.0437F, -0.1308F, 0.0057F));

		PartDefinition Tailend_r1 = Tail6.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(9, 148).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.5423F, 7.6158F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailend_r2 = Tail6.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(94, 133).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.5423F, 5.6158F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailend_r3 = Tail6.addOrReplaceChild("Tailend_r3", CubeListBuilder.create().texOffs(103, 100).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.5423F, 3.6158F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailend_r4 = Tail6.addOrReplaceChild("Tailend_r4", CubeListBuilder.create().texOffs(146, 145).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.5423F, 1.6158F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tailbase_r17 = Tail6.addOrReplaceChild("Tailbase_r17", CubeListBuilder.create().texOffs(0, 148).addBox(0.0F, 15.9F, 54.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 147).addBox(0.0F, 15.1F, 52.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 147).addBox(0.0F, 14.5F, 50.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 147).addBox(0.0F, 13.8F, 48.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2225F, -49.0916F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tailend_r5 = Tail6.addOrReplaceChild("Tailend_r5", CubeListBuilder.create().texOffs(58, 134).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.5423F, -0.3842F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(62, 12).addBox(-0.5F, -0.5665F, 0.0151F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.025F, 9.55F, -0.1405F, -0.1296F, 0.0183F));

		PartDefinition Tailbase_r18 = Tail7.addOrReplaceChild("Tailbase_r18", CubeListBuilder.create().texOffs(33, 148).addBox(0.0F, 20.5F, 64.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 148).addBox(0.0F, 19.7F, 62.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 148).addBox(0.0F, 19.0F, 60.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 148).addBox(0.0F, 18.3F, 58.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 148).addBox(0.0F, 17.5F, 56.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1975F, -58.6416F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(17, 72).addBox(-0.5F, -0.5665F, 0.0151F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.8F, -0.1055F, -0.4342F, 0.0445F));

		PartDefinition Tailbase_r19 = Tail8.addOrReplaceChild("Tailbase_r19", CubeListBuilder.create().texOffs(29, 92).addBox(0.0F, 22.0F, 68.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 82).addBox(0.0F, 21.3F, 66.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1975F, -68.4416F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tail9 = Tail8.addOrReplaceChild("Tail9", CubeListBuilder.create().texOffs(36, 75).addBox(-0.5F, -0.5665F, 0.0151F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0182F, 7.9017F, -0.2566F, -0.5522F, 0.1368F));

		return LayerDefinition.create(meshdefinition, 152, 152);
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