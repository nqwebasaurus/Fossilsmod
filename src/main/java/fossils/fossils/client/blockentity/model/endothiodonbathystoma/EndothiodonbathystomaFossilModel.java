package fossils.fossils.client.blockentity.model.endothiodonbathystoma;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EndothiodonbathystomaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart endothiodon;
	private final ModelPart bodycentre;
	private final ModelPart bodyback;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart bodyfront;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart jaw;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;

	public EndothiodonbathystomaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.endothiodon = this.fossil.getChild("endothiodon");
		this.bodycentre = this.endothiodon.getChild("bodycentre");
		this.bodyback = this.bodycentre.getChild("bodyback");
		this.tail1 = this.bodyback.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.upperleg1 = this.bodyback.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.bodyback.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.bodyfront = this.bodycentre.getChild("bodyfront");
		this.neck1 = this.bodyfront.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.bone = this.head.getChild("bone");
		this.bone2 = this.head.getChild("bone2");
		this.jaw = this.head.getChild("jaw");
		this.upperarm1 = this.bodyfront.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.bodyfront.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition endothiodon = fossil.addOrReplaceChild("endothiodon", CubeListBuilder.create(), PartPose.offset(5.0F, 0.0F, -5.0F));

		PartDefinition bodycentre = endothiodon.addOrReplaceChild("bodycentre", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bodycentre.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 19).addBox(-5.5F, -0.1059F, 0.016F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -19.6F, 4.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bodycentre.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(34, 39).mirror().addBox(-5.7614F, -2.7614F, -0.5074F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -18.5625F, 10.2128F, -0.0187F, -0.0468F, -1.4832F));

		PartDefinition cube_r3 = bodycentre.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 52).mirror().addBox(-3.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -18.5625F, 10.2128F, -0.0409F, -0.0295F, -0.9158F));

		PartDefinition cube_r4 = bodycentre.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(51, 36).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -18.5625F, 10.2128F, -0.0503F, -0.0131F, -0.4797F));

		PartDefinition cube_r5 = bodycentre.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 21).mirror().addBox(-7.7614F, -2.7614F, -0.5074F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -18.7625F, 8.2128F, 0.0062F, 0.0459F, -1.4309F));

		PartDefinition cube_r6 = bodycentre.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 60).mirror().addBox(-3.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -18.7625F, 8.2128F, 0.0299F, 0.0354F, -0.8633F));

		PartDefinition cube_r7 = bodycentre.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(61, 36).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -18.7625F, 8.2128F, 0.0412F, 0.0157F, -0.4272F));

		PartDefinition cube_r8 = bodycentre.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(57, 42).mirror().addBox(-8.7614F, -2.7614F, -0.5074F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.0625F, 6.2128F, 0.0153F, 0.0796F, -1.3779F));

		PartDefinition cube_r9 = bodycentre.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(46, 66).mirror().addBox(-3.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.0625F, 6.2128F, 0.0557F, 0.0589F, -0.8097F));

		PartDefinition cube_r10 = bodycentre.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(21, 66).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.0625F, 6.2128F, 0.0745F, 0.0262F, -0.3742F));

		PartDefinition cube_r11 = bodycentre.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(45, 30).mirror().addBox(-9.7614F, -2.7614F, -0.5074F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.1625F, 4.2128F, 0.0267F, 0.1217F, -1.3593F));

		PartDefinition cube_r12 = bodycentre.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-3.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.1625F, 4.2128F, 0.088F, 0.0883F, -0.7898F));

		PartDefinition cube_r13 = bodycentre.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(61, 77).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.1625F, 4.2128F, 0.1162F, 0.0393F, -0.3553F));

		PartDefinition cube_r14 = bodycentre.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(38, 26).mirror().addBox(-10.7614F, -2.7614F, -0.5074F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.2625F, 2.2128F, 0.0382F, 0.1638F, -1.3228F));

		PartDefinition cube_r15 = bodycentre.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(-3.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.2625F, 2.2128F, 0.1206F, 0.1176F, -0.7516F));

		PartDefinition cube_r16 = bodycentre.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(77, 70).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.2625F, 2.2128F, 0.1579F, 0.0522F, -0.3185F));

		PartDefinition cube_r17 = bodycentre.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(30, 14).mirror().addBox(-11.7614F, -2.7614F, -0.5074F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.2625F, 0.2128F, 0.0382F, 0.1638F, -1.3228F));

		PartDefinition cube_r18 = bodycentre.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(77, 72).mirror().addBox(-3.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.2625F, 0.2128F, 0.1206F, 0.1176F, -0.7516F));

		PartDefinition cube_r19 = bodycentre.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(78, 2).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.2625F, 0.2128F, 0.1579F, 0.0522F, -0.3185F));

		PartDefinition cube_r20 = bodycentre.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(78, 25).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.2625F, -1.7872F, 0.1579F, 0.0522F, -0.336F));

		PartDefinition cube_r21 = bodycentre.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(78, 4).mirror().addBox(-3.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.2625F, -1.7872F, 0.1206F, 0.1176F, -0.7691F));

		PartDefinition cube_r22 = bodycentre.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(30, 16).mirror().addBox(-11.7614F, -2.7614F, -0.5074F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -19.2625F, -1.7872F, 0.0382F, 0.1638F, -1.3403F));

		PartDefinition cube_r23 = bodycentre.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(34, 39).addBox(2.7614F, -2.7614F, -0.5074F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -18.5625F, 10.2128F, -0.0187F, 0.0468F, 1.4832F));

		PartDefinition cube_r24 = bodycentre.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(18, 52).addBox(1.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -18.5625F, 10.2128F, -0.0409F, 0.0295F, 0.9158F));

		PartDefinition cube_r25 = bodycentre.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(51, 36).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -18.5625F, 10.2128F, -0.0503F, 0.0131F, 0.4797F));

		PartDefinition cube_r26 = bodycentre.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(20, 21).addBox(2.7614F, -2.7614F, -0.5074F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -18.7625F, 8.2128F, 0.0062F, -0.0459F, 1.4309F));

		PartDefinition cube_r27 = bodycentre.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(64, 60).addBox(1.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -18.7625F, 8.2128F, 0.0299F, -0.0354F, 0.8633F));

		PartDefinition cube_r28 = bodycentre.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(61, 36).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -18.7625F, 8.2128F, 0.0412F, -0.0157F, 0.4272F));

		PartDefinition cube_r29 = bodycentre.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(57, 42).addBox(2.7614F, -2.7614F, -0.5074F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.0625F, 6.2128F, 0.0153F, -0.0796F, 1.3779F));

		PartDefinition cube_r30 = bodycentre.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(46, 66).addBox(1.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.0625F, 6.2128F, 0.0557F, -0.0589F, 0.8097F));

		PartDefinition cube_r31 = bodycentre.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(21, 66).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.0625F, 6.2128F, 0.0745F, -0.0262F, 0.3742F));

		PartDefinition cube_r32 = bodycentre.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(61, 77).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.1625F, 4.2128F, 0.1162F, -0.0393F, 0.3553F));

		PartDefinition cube_r33 = bodycentre.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(77, 34).addBox(1.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.1625F, 4.2128F, 0.088F, -0.0883F, 0.7898F));

		PartDefinition cube_r34 = bodycentre.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(45, 30).addBox(2.7614F, -2.7614F, -0.5074F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.1625F, 4.2128F, 0.0267F, -0.1217F, 1.3593F));

		PartDefinition cube_r35 = bodycentre.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(77, 70).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.2625F, 2.2128F, 0.1579F, -0.0522F, 0.3185F));

		PartDefinition cube_r36 = bodycentre.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(77, 63).addBox(1.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.2625F, 2.2128F, 0.1206F, -0.1176F, 0.7516F));

		PartDefinition cube_r37 = bodycentre.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(38, 26).addBox(2.7614F, -2.7614F, -0.5074F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.2625F, 2.2128F, 0.0382F, -0.1638F, 1.3228F));

		PartDefinition cube_r38 = bodycentre.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(78, 2).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.2625F, 0.2128F, 0.1579F, -0.0522F, 0.3185F));

		PartDefinition cube_r39 = bodycentre.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(77, 72).addBox(1.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.2625F, 0.2128F, 0.1206F, -0.1176F, 0.7516F));

		PartDefinition cube_r40 = bodycentre.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(30, 14).addBox(2.7614F, -2.7614F, -0.5074F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.2625F, 0.2128F, 0.0382F, -0.1638F, 1.3228F));

		PartDefinition cube_r41 = bodycentre.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(30, 16).addBox(2.7614F, -2.7614F, -0.5074F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.2625F, -1.7872F, 0.0382F, -0.1638F, 1.3403F));

		PartDefinition cube_r42 = bodycentre.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(78, 4).addBox(1.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.2625F, -1.7872F, 0.1206F, -0.1176F, 0.7691F));

		PartDefinition cube_r43 = bodycentre.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(78, 25).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -19.2625F, -1.7872F, 0.1579F, -0.0522F, 0.336F));

		PartDefinition cube_r44 = bodycentre.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(47, 11).addBox(-5.0F, -3.467F, 12.0175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-5.0F, -3.367F, 10.0175F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(-5.0F, -3.267F, 8.0175F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 0).addBox(-5.0F, -3.067F, 6.0175F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 37).addBox(-5.0F, -2.767F, 4.0175F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 47).addBox(-5.0F, -2.467F, 2.0175F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 50).addBox(-5.0F, -1.967F, 0.0175F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.8F, -2.3F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r45 = bodycentre.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(20, 12).addBox(-5.5F, 0.033F, 0.0175F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.8F, -2.3F, -0.0087F, 0.0F, 0.0F));

		PartDefinition bodyback = bodycentre.addOrReplaceChild("bodyback", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -18.4F, 11.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r46 = bodyback.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(18, 61).mirror().addBox(-2.5F, 0.0F, 1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 61).addBox(0.5F, 0.0F, 1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(36, 31).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3617F, 0.1239F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r47 = bodyback.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(9, 69).mirror().addBox(-0.0455F, -0.4104F, -0.2953F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 3.556F, 3.0807F, -1.1868F, 0.0F, -0.4363F));

		PartDefinition cube_r48 = bodyback.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(69, 23).mirror().addBox(-0.0455F, -1.2903F, -0.4117F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 3.556F, 3.0807F, -0.7679F, 0.0F, -0.4363F));

		PartDefinition cube_r49 = bodyback.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(21, 69).mirror().addBox(-0.5F, -0.8626F, -0.4049F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.456F, 3.0807F, -1.7279F, 0.0F, -0.2182F));

		PartDefinition cube_r50 = bodyback.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-0.5F, -1.932F, 2.1847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 36).mirror().addBox(-0.5F, -0.932F, -1.8153F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(63, 72).mirror().addBox(-0.5F, -1.932F, 0.1847F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(55, 0).addBox(4.1F, -1.932F, 2.1847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 36).addBox(4.1F, -0.932F, -1.8153F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(63, 72).addBox(4.1F, -1.932F, 0.1847F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.3F, 0.9173F, 2.3549F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bodyback.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(-0.5F, 0.0018F, -2.9972F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 66).addBox(4.1F, 0.0018F, -2.9972F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, -1.1827F, 2.1549F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bodyback.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(10, 10).mirror().addBox(-0.5F, -0.0028F, -2.0349F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 10).addBox(4.1F, -0.0028F, -2.0349F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, -0.1827F, 3.9549F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r53 = bodyback.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(9, 69).addBox(-0.9545F, -0.4104F, -0.2953F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 3.556F, 3.0807F, -1.1868F, 0.0F, 0.4363F));

		PartDefinition cube_r54 = bodyback.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(69, 23).addBox(-0.9545F, -1.2903F, -0.4117F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1F, 3.556F, 3.0807F, -0.7679F, 0.0F, 0.4363F));

		PartDefinition cube_r55 = bodyback.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(39, 31).addBox(-5.0F, -3.467F, 17.5175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 45).addBox(-5.0F, -3.467F, 15.5175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 45).addBox(-5.0F, -3.467F, 13.5175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -1.3617F, -13.6761F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r56 = bodyback.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(21, 69).addBox(-0.5F, -0.8626F, -0.4049F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 1.456F, 3.0807F, -1.7279F, 0.0F, 0.2182F));

		PartDefinition tail1 = bodyback.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(54, 36).addBox(-0.5F, -0.5965F, -0.0962F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(29, 7).addBox(0.0F, -1.0965F, -0.0962F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 28).addBox(0.0F, -1.0965F, 1.9038F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6383F, 5.7239F, -0.6127F, 0.0715F, -0.0501F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 72).addBox(-0.5F, -0.2708F, 0.0226F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(57, 23).addBox(0.0F, -0.5708F, 0.0226F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 19).addBox(0.0F, -0.5708F, 2.0226F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2965F, 3.7038F, -0.4396F, 0.1704F, -0.0381F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(13, 45).addBox(-0.5F, -0.3877F, 0.0607F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1292F, 2.9226F, -0.1742F, 0.0869F, 0.0076F));

		PartDefinition upperleg1 = bodyback.addOrReplaceChild("upperleg1", CubeListBuilder.create().texOffs(9, 59).addBox(-1.053F, 2.4179F, -1.3998F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(60, 30).addBox(-1.553F, -0.5821F, -1.3998F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 3.8048F, 2.9621F, 0.2154F, -0.1188F, -0.6287F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8058F, 7.3369F, -0.2998F, 1.012F, 0.0393F, 0.5374F));

		PartDefinition leg2_r1 = leg1.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(49, 70).addBox(9.9051F, -1.9496F, -0.1031F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 50).addBox(9.3232F, -1.9629F, -2.5012F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8885F, 1.0014F, 11.1857F, 1.8627F, 1.5246F, 1.7815F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5955F, 5.7218F, 0.5468F, -0.1606F, 0.1546F, -0.0508F));

		PartDefinition feet2_r1 = feet1.addOrReplaceChild("feet2_r1", CubeListBuilder.create().texOffs(41, 0).addBox(-2.5F, -0.5F, -2.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2524F, 1.4906F, 0.0084F, 0.6297F, 0.0121F, -0.0205F));

		PartDefinition feet1_r1 = feet1.addOrReplaceChild("feet1_r1", CubeListBuilder.create().texOffs(34, 18).addBox(-4.2669F, 3.4578F, -9.4842F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5075F, -1.8261F, 5.5397F, -0.0041F, -0.0059F, -0.0341F));

		PartDefinition upperleg2 = bodyback.addOrReplaceChild("upperleg2", CubeListBuilder.create().texOffs(0, 59).addBox(-0.947F, 2.4179F, -1.3998F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(59, 6).addBox(-1.447F, -0.5821F, -1.3998F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 3.8048F, 2.9621F, -0.3954F, 0.1188F, 0.6287F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8058F, 7.3369F, -0.2998F, 0.6494F, 0.2614F, -0.6405F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(69, 65).addBox(-10.9051F, -1.9496F, -0.1031F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 50).addBox(-11.3232F, -1.9629F, -2.5012F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8885F, 1.0014F, 11.1857F, 1.8627F, -1.5246F, -1.7815F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5955F, 5.7218F, 0.5468F, -0.1587F, 0.0177F, 0.023F));

		PartDefinition feet3_r1 = feet2.addOrReplaceChild("feet3_r1", CubeListBuilder.create().texOffs(40, 39).addBox(-2.5F, -0.5F, -2.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2524F, 1.4906F, 0.0084F, 0.6297F, -0.0121F, 0.0205F));

		PartDefinition feet2_r2 = feet2.addOrReplaceChild("feet2_r2", CubeListBuilder.create().texOffs(25, 31).addBox(-0.7331F, 3.4578F, -9.4842F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5075F, -1.8261F, 5.5397F, -0.0041F, 0.0059F, 0.0341F));

		PartDefinition bodyfront = bodycentre.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offset(-5.0F, -19.4F, -2.3F));

		PartDefinition cube_r57 = bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(57, 58).mirror().addBox(-0.6974F, -0.3557F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.211F, 8.8105F, -6.3923F, 1.606F, -0.4206F, -1.1711F));

		PartDefinition cube_r58 = bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(27, 48).mirror().addBox(-0.3F, -0.0844F, -3.6476F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 7.2872F, -4.6695F, 1.1972F, -0.3227F, -0.7239F));

		PartDefinition cube_r59 = bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(11, 52).mirror().addBox(-0.5F, 0.5F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 64).mirror().addBox(-0.5F, -0.5F, 1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 64).addBox(7.5F, -0.5F, 1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(11, 52).addBox(7.5F, 0.5F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 4.7872F, -2.8695F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r60 = bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(57, 58).addBox(-0.3026F, -0.3557F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.211F, 8.8105F, -6.3923F, 1.606F, 0.4206F, 1.1711F));

		PartDefinition cube_r61 = bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(27, 48).addBox(-0.7F, -0.0844F, -3.6476F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 7.2872F, -4.6695F, 1.1972F, 0.3227F, 0.7239F));

		PartDefinition cube_r62 = bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(38, 24).mirror().addBox(-10.7614F, -2.7614F, -0.5074F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4375F, -1.1872F, 0.0382F, 0.1638F, -1.3577F));

		PartDefinition cube_r63 = bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(77, 30).mirror().addBox(-3.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4375F, -1.1872F, 0.1206F, 0.1176F, -0.7865F));

		PartDefinition cube_r64 = bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(29, 77).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4375F, -1.1872F, 0.1579F, 0.0522F, -0.3534F));

		PartDefinition cube_r65 = bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(42, 28).mirror().addBox(-9.7614F, -2.7614F, -0.5074F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8375F, -3.1872F, 0.0382F, 0.1638F, -1.4624F));

		PartDefinition cube_r66 = bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(77, 28).mirror().addBox(-3.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8375F, -3.1872F, 0.1206F, 0.1176F, -0.8912F));

		PartDefinition cube_r67 = bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(14, 77).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8375F, -3.1872F, 0.1579F, 0.0522F, -0.4581F));

		PartDefinition cube_r68 = bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(26, 45).mirror().addBox(-7.7614F, -2.7614F, -0.5074F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2375F, -5.1872F, 0.0618F, 0.248F, -1.5449F));

		PartDefinition cube_r69 = bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(76, 49).mirror().addBox(-3.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2375F, -5.1872F, 0.1863F, 0.1758F, -0.9689F));

		PartDefinition cube_r70 = bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2375F, -5.1872F, 0.2415F, 0.0779F, -0.54F));

		PartDefinition cube_r71 = bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(26, 45).addBox(2.7614F, -2.7614F, -0.5074F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2375F, -5.1872F, 0.0618F, -0.248F, 1.5449F));

		PartDefinition cube_r72 = bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(76, 49).addBox(1.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2375F, -5.1872F, 0.1863F, -0.1758F, 0.9689F));

		PartDefinition cube_r73 = bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(75, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2375F, -5.1872F, 0.2415F, -0.0779F, 0.54F));

		PartDefinition cube_r74 = bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(42, 28).addBox(2.7614F, -2.7614F, -0.5074F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8375F, -3.1872F, 0.0382F, -0.1638F, 1.4624F));

		PartDefinition cube_r75 = bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(77, 28).addBox(1.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8375F, -3.1872F, 0.1206F, -0.1176F, 0.8912F));

		PartDefinition cube_r76 = bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(14, 77).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8375F, -3.1872F, 0.1579F, -0.0522F, 0.4581F));

		PartDefinition cube_r77 = bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(38, 24).addBox(2.7614F, -2.7614F, -0.5074F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4375F, -1.1872F, 0.0382F, -0.1638F, 1.3577F));

		PartDefinition cube_r78 = bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(77, 30).addBox(1.8126F, -0.8452F, -0.5074F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4375F, -1.1872F, 0.1206F, -0.1176F, 0.7865F));

		PartDefinition cube_r79 = bodyfront.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(29, 77).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4375F, -1.1872F, 0.1579F, -0.0522F, 0.3534F));

		PartDefinition cube_r80 = bodyfront.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(25, 55).addBox(-0.5F, -3.4175F, 3.8337F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 56).addBox(-0.5F, -2.5175F, 1.8337F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1F, -5.7F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r81 = bodyfront.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(59, 44).addBox(-0.5F, -1.7175F, -0.1663F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1F, -5.7F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r82 = bodyfront.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(10, 37).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.9F, -5.7F, 0.2094F, 0.0F, 0.0F));

		PartDefinition neck1 = bodyfront.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, -5.5F, -0.4828F, 0.2598F, -0.0448F));

		PartDefinition cube_r83 = neck1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(48, 18).addBox(0.0F, -0.9914F, 0.0462F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1958F, -2.0239F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r84 = neck1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(71, 34).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4958F, -2.7239F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r85 = neck1.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(6, 67).mirror().addBox(-4.8612F, -2.7585F, -0.5018F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5612F, -1.4913F, 0.0617F, 0.6664F, -1.6689F));

		PartDefinition cube_r86 = neck1.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(49, 44).mirror().addBox(-3.8953F, -0.7892F, -0.5018F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5612F, -1.4913F, 0.4438F, 0.5182F, -1.0036F));

		PartDefinition cube_r87 = neck1.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(47, 9).mirror().addBox(-2.0512F, 0.0857F, -0.4942F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5612F, -1.4913F, 0.6077F, 0.2925F, -0.5954F));

		PartDefinition cube_r88 = neck1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(49, 44).addBox(1.8953F, -0.7892F, -0.5018F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5612F, -1.4913F, 0.4438F, -0.5182F, 1.0036F));

		PartDefinition cube_r89 = neck1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(6, 67).addBox(2.8612F, -2.7585F, -0.5018F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5612F, -1.4913F, 0.0617F, -0.6664F, 1.6689F));

		PartDefinition cube_r90 = neck1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(47, 9).addBox(0.0512F, 0.0857F, -0.4942F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5612F, -1.4913F, 0.6077F, -0.2925F, 0.5954F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6958F, -2.7239F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r91 = neck2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(10, 19).addBox(0.5F, -1.3561F, 2.0151F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(51, 16).addBox(0.5F, -1.0561F, 0.0151F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r92 = neck2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(5, 45).addBox(0.0F, -1.0F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 1.0F, -3.6F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r93 = neck2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(41, 5).mirror().addBox(-2.7909F, -0.8545F, -0.5714F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3368F, -0.3794F, 0.1339F, 0.5639F, -1.211F));

		PartDefinition cube_r94 = neck2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(20, 23).mirror().addBox(-1.9845F, -0.0175F, -0.5641F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3368F, -0.3794F, 0.3719F, 0.4486F, -0.7282F));

		PartDefinition cube_r95 = neck2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(37, 0).mirror().addBox(-0.9897F, -0.7897F, -2.2297F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3368F, -0.3794F, 0.4463F, 0.5056F, -0.694F));

		PartDefinition cube_r96 = neck2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(37, 0).addBox(-1.0103F, -0.7897F, -2.2297F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3368F, -0.3794F, 0.4463F, -0.5056F, 0.694F));

		PartDefinition cube_r97 = neck2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(20, 23).addBox(-0.0155F, -0.0175F, -0.5641F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3368F, -0.3794F, 0.3719F, -0.4486F, 0.7282F));

		PartDefinition cube_r98 = neck2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(41, 5).addBox(1.7909F, -0.8545F, -0.5714F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3368F, -0.3794F, 0.1339F, -0.5639F, 1.211F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.8F, 0.9641F, 0.0795F, 0.1041F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(76, 12).addBox(-1.5F, 0.1323F, -0.5402F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 0.8104F, -12.3137F, 1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, 0.0215F, -0.9775F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0896F, -12.3137F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(63, 44).addBox(-1.5F, -0.053F, -1.9701F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7896F, -11.3137F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(45, 32).addBox(-2.5F, -1.0114F, -0.0145F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6485F, -7.339F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(19, 28).mirror().addBox(-2.0F, -0.4793F, -0.0998F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 28).addBox(2.0F, -0.4793F, -0.0998F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 7).addBox(-2.5F, -3.0793F, -0.0998F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5485F, -10.039F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(37, 44).addBox(-2.0F, -0.0351F, -0.0457F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7515F, -11.339F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(76, 54).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 54).addBox(3.04F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.02F, -0.9322F, -10.2573F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(74, 65).mirror().addBox(-2.02F, 0.4764F, -0.6168F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 0).mirror().addBox(-2.05F, 0.9764F, -0.1168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 44).mirror().addBox(-2.24F, 0.4764F, -0.6168F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 0).addBox(2.05F, 0.9764F, -0.1168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 44).addBox(2.24F, 0.4764F, -0.6168F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(74, 65).addBox(2.02F, 0.4764F, -0.6168F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 5).addBox(-2.0F, 2.5764F, -0.3168F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(0, 0).addBox(-2.0F, 0.0764F, -2.3168F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -2.8515F, -6.439F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(68, 76).addBox(-1.0F, -1.0228F, 0.0107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.6485F, -4.339F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(70, 15).addBox(-1.0F, -0.9524F, -0.9981F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.0485F, -6.239F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 52).addBox(-1.0F, -0.157F, -3.9815F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -2.3068F, 2.7443F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(66, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -3.6735F, -3.3221F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0F, -2.0281F, -0.0168F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.1815F, -3.1991F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(74, 58).mirror().addBox(0.0F, -0.3361F, -1.7576F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.8815F, -3.3991F, 0.2192F, 0.6104F, -0.0244F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(74, 58).addBox(-1.0F, -0.3361F, -1.7576F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8815F, -3.3991F, 0.2192F, -0.6104F, 0.0244F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(75, 20).addBox(-1.0F, 0.0043F, -0.0447F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2815F, -5.0991F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(62, 18).addBox(-1.0F, -0.0059F, -0.8275F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8815F, -7.1991F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(0.0F, -3.742F, -1.9902F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.4228F, 0.5324F, -0.8114F, -0.2166F, -0.3196F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(59, 12).mirror().addBox(0.0829F, -0.9102F, 0.0449F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.7878F, -3.3433F, -0.5651F, -0.6368F, 0.4239F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(62, 64).mirror().addBox(-3.5F, -0.5225F, -0.0867F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(62, 64).addBox(1.5F, -0.5225F, -0.0867F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5859F, 2.5697F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(61, 50).mirror().addBox(-1.6744F, -0.5225F, -1.5342F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5859F, 2.5697F, -1.0449F, 0.5237F, -0.7112F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(61, 50).addBox(-1.3256F, -0.5225F, -1.5342F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5859F, 2.5697F, -1.0449F, -0.5237F, 0.7112F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -3.742F, -1.9902F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.4228F, 0.5324F, -0.8114F, 0.2166F, 0.3196F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(18, 45).addBox(-0.5F, -1.2F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5908F, -2.1965F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(59, 12).addBox(-1.0829F, -0.9102F, 0.0449F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.7878F, -3.3433F, -0.5651F, 0.6368F, -0.4239F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4131F, -1.1435F, -4.9869F, 0.0669F, 0.3226F, 0.5187F));

		PartDefinition cube_r124 = bone.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(67, 54).addBox(-0.6496F, -0.5558F, -0.2903F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 5.8F, -0.6015F, -0.1147F, 0.0868F));

		PartDefinition cube_r125 = bone.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(7, 75).addBox(-0.6024F, -0.5794F, -0.2033F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 4.2F, -0.0949F, -0.0295F, 0.0205F));

		PartDefinition cube_r126 = bone.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(71, 29).addBox(-0.6024F, -0.7614F, -2.8822F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.9F, 0.1389F, 0.1865F, -0.1085F));

		PartDefinition cube_r127 = bone.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(67, 9).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1024F, -0.59F, 2.0759F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r128 = bone.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(69, 0).addBox(-0.7195F, -2.0993F, 0.0927F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.3F, -0.3F, 0.4241F, 0.1966F, -0.123F));

		PartDefinition bone2 = head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4131F, -1.1435F, -4.9869F, 0.0669F, -0.3226F, -0.5187F));

		PartDefinition cube_r129 = bone2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(67, 54).mirror().addBox(-0.3504F, -0.5558F, -0.2903F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3F, 5.8F, -0.6015F, 0.1147F, -0.0868F));

		PartDefinition cube_r130 = bone2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(7, 75).mirror().addBox(-0.3976F, -0.5794F, -0.2033F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3F, 4.2F, -0.0949F, 0.0295F, -0.0205F));

		PartDefinition cube_r131 = bone2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(71, 29).mirror().addBox(-0.3976F, -0.7614F, -2.8822F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3F, 1.9F, 0.1389F, -0.1865F, 0.1085F));

		PartDefinition cube_r132 = bone2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(67, 9).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1024F, -0.59F, 2.0759F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r133 = bone2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-0.2805F, -2.0993F, 0.0927F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.3F, -0.3F, 0.4241F, -0.1966F, 0.123F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8024F, -1.5487F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(10, 19).mirror().addBox(-1.5F, -0.6018F, 0.1714F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 28).mirror().addBox(-2.0F, -0.2018F, -0.8286F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(10, 19).addBox(1.5F, -0.6018F, 0.1714F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 28).addBox(1.0F, -0.2018F, -0.8286F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5169F, -8.3865F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(22, 75).mirror().addBox(-1.2F, -3.9872F, -1.0307F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 75).addBox(0.2F, -3.9872F, -1.0307F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7169F, -6.1865F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(13, 79).mirror().addBox(-1.2F, -2.045F, -0.1298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(45, 78).mirror().addBox(-2.0F, -2.045F, 0.8702F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(45, 78).addBox(1.0F, -2.045F, 0.8702F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(13, 79).addBox(0.2F, -2.045F, -0.1298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.8169F, -9.5865F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(18, 79).mirror().addBox(-1.2F, -2.6545F, -3.6243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(18, 79).addBox(0.2F, -2.6545F, -3.6243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.7169F, -6.1865F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(26, 37).mirror().addBox(-2.0F, -2.0515F, -0.0086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 47).mirror().addBox(-2.0F, -1.0515F, 0.2914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(26, 47).addBox(1.0F, -1.0515F, 0.2914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(26, 37).addBox(1.0F, -2.0515F, -0.0086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6169F, -7.8865F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(40, 66).mirror().addBox(-2.0F, -1.9776F, -2.9076F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(40, 66).addBox(1.0F, -1.9776F, -2.9076F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.2169F, -4.0865F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(31, 66).mirror().addBox(-2.0F, -0.0042F, -0.0422F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(31, 66).addBox(3.0F, -0.0042F, -0.0422F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -0.5831F, -3.2865F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(18, 55).mirror().addBox(-2.0F, -0.6F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 55).addBox(3.0F, -0.6F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0154F, -3.3038F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(70, 49).mirror().addBox(-2.0F, 0.0873F, 0.6229F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 52).addBox(1.0F, -0.9127F, 0.6229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(70, 49).addBox(1.0F, 0.0873F, 0.6229F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7169F, -6.1865F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(28, 79).addBox(-0.5F, -3.2009F, -4.2749F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.7169F, -6.1865F, 0.1047F, 0.0F, 0.0F));

		PartDefinition upperarm1 = bodyfront.addOrReplaceChild("upperarm1", CubeListBuilder.create().texOffs(51, 16).addBox(-1.187F, -0.908F, -0.4596F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 72).addBox(-1.187F, 2.092F, 0.0404F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 23).addBox(-1.187F, 4.092F, -0.4596F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 9.2611F, -3.6721F, 0.6379F, 0.132F, -1.0545F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.181F, 6.2133F, 1.4092F, -0.8413F, 0.3092F, 0.9938F));

		PartDefinition lowerarm4_r1 = lowerarm1.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(0, 77).addBox(-9.0868F, -0.9423F, 3.7673F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 60).addBox(-10.0868F, 2.0577F, 3.1673F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 10).addBox(-9.5868F, 5.0577F, 3.6673F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.128F, -4.1014F, -8.7503F, -0.3572F, 1.2533F, -0.2064F));

		PartDefinition lowerarm2_r1 = lowerarm1.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(54, 76).addBox(-9.5799F, 4.5998F, 1.3364F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 37).addBox(-9.0799F, 6.5998F, 1.3364F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.128F, -4.1014F, -8.7503F, -0.2438F, 1.2533F, -0.2064F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.702F, 5.8683F, -0.7516F, 0.8489F, 0.2471F, 0.1721F));

		PartDefinition hand2_r1 = hand1.addOrReplaceChild("hand2_r1", CubeListBuilder.create().texOffs(23, 24).addBox(-2.3783F, 5.3448F, 2.985F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0445F, -6.6877F, -5.174F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand2_r2 = hand1.addOrReplaceChild("hand2_r2", CubeListBuilder.create().texOffs(0, 73).addBox(-5.2093F, 8.9363F, -4.4143F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8555F, -9.562F, -3.2992F, 0.481F, 0.3133F, -0.5334F));

		PartDefinition hand2_r3 = hand1.addOrReplaceChild("hand2_r3", CubeListBuilder.create().texOffs(39, 72).addBox(2.8176F, 8.7986F, -4.4986F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3445F, -9.562F, -3.2992F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition upperarm2 = bodyfront.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(51, 9).addBox(-0.813F, -0.908F, -0.4596F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(54, 71).addBox(-0.813F, 2.092F, 0.0404F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 0).addBox(-0.813F, 4.092F, -0.4596F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9F, 9.2611F, -3.6721F, -0.1475F, -0.132F, 1.0545F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.181F, 6.2133F, 1.4092F, -0.839F, 0.3915F, -0.9835F));

		PartDefinition lowerarm5_r1 = lowerarm2.addOrReplaceChild("lowerarm5_r1", CubeListBuilder.create().texOffs(75, 76).addBox(8.0868F, -0.9423F, 3.7673F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 60).addBox(7.0868F, 2.0577F, 3.1673F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).addBox(7.5868F, 5.0577F, 3.6673F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.128F, -4.1014F, -8.7503F, -0.3572F, -1.2533F, 0.2064F));

		PartDefinition lowerarm3_r1 = lowerarm2.addOrReplaceChild("lowerarm3_r1", CubeListBuilder.create().texOffs(38, 76).addBox(7.5799F, 4.5998F, 1.3364F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 28).addBox(8.0799F, 6.5998F, 1.3364F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.128F, -4.1014F, -8.7503F, -0.2438F, -1.2533F, 0.2064F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.702F, 5.8683F, -0.7516F, 1.3173F, 0.1432F, -0.0482F));

		PartDefinition hand3_r1 = hand2.addOrReplaceChild("hand3_r1", CubeListBuilder.create().texOffs(22, 0).addBox(-2.6217F, 5.3448F, 2.985F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0445F, -6.6877F, -5.174F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand3_r2 = hand2.addOrReplaceChild("hand3_r2", CubeListBuilder.create().texOffs(72, 40).addBox(3.2093F, 8.9363F, -4.4143F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8555F, -9.562F, -3.2992F, 0.481F, -0.3133F, 0.5334F));

		PartDefinition hand3_r3 = hand2.addOrReplaceChild("hand3_r3", CubeListBuilder.create().texOffs(0, 46).addBox(-4.8176F, 8.7986F, -4.4986F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3445F, -9.562F, -3.2992F, 0.532F, 0.2071F, -0.3361F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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