package fossils.fossils.client.blockentity.model.litargosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LitargosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart backLeftLeg;
	private final ModelPart backLeftLeg2;
	private final ModelPart backLeftLeg3;
	private final ModelPart backLeftLeg4;
	private final ModelPart backRightLeg;
	private final ModelPart backRightLeg2;
	private final ModelPart backRightLeg3;
	private final ModelPart backRightLeg4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart frontLeftLeg;
	private final ModelPart frontLeftLeg2;
	private final ModelPart frontLeftLeg3;
	private final ModelPart frontLeftLeg4;
	private final ModelPart frontRightLeg;
	private final ModelPart frontRightLeg2;
	private final ModelPart frontRightLeg3;
	private final ModelPart frontRightLeg4;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;

	public LitargosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.backLeftLeg = this.main.getChild("backLeftLeg");
		this.backLeftLeg2 = this.backLeftLeg.getChild("backLeftLeg2");
		this.backLeftLeg3 = this.backLeftLeg2.getChild("backLeftLeg3");
		this.backLeftLeg4 = this.backLeftLeg3.getChild("backLeftLeg4");
		this.backRightLeg = this.main.getChild("backRightLeg");
		this.backRightLeg2 = this.backRightLeg.getChild("backRightLeg2");
		this.backRightLeg3 = this.backRightLeg2.getChild("backRightLeg3");
		this.backRightLeg4 = this.backRightLeg3.getChild("backRightLeg4");
		this.tail = this.main.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.body = this.main.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.frontLeftLeg = this.body2.getChild("frontLeftLeg");
		this.frontLeftLeg2 = this.frontLeftLeg.getChild("frontLeftLeg2");
		this.frontLeftLeg3 = this.frontLeftLeg2.getChild("frontLeftLeg3");
		this.frontLeftLeg4 = this.frontLeftLeg3.getChild("frontLeftLeg4");
		this.frontRightLeg = this.body2.getChild("frontRightLeg");
		this.frontRightLeg2 = this.frontRightLeg.getChild("frontRightLeg2");
		this.frontRightLeg3 = this.frontRightLeg2.getChild("frontRightLeg3");
		this.frontRightLeg4 = this.frontRightLeg3.getChild("frontRightLeg4");
		this.neck = this.body2.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create().texOffs(21, 52).addBox(0.0F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(36, 9).addBox(-0.5F, -1.0F, -3.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F))
				.texOffs(36, 16).addBox(-0.8F, -1.3F, -3.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 42).addBox(0.5F, -1.1F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(21, 52).mirror().addBox(-1.0F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(44, 42).mirror().addBox(-1.5F, -1.1F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(0.0F, -12.35F, 1.0F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(45, 36).mirror().addBox(-0.4266F, -0.1153F, -2.3641F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7032F, 0.7026F, -2.7941F, 1.1519F, 0.0F, -0.2443F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(49, 32).mirror().addBox(-0.5726F, -0.4665F, -0.334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6537F, 0.2978F, -0.8169F, -0.4108F, 0.2086F, -0.3343F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(65, 59).mirror().addBox(-0.2F, -0.2106F, -0.0896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.3533F, -1.4909F, -0.576F, 0.0F, -0.2443F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(18, 43).mirror().addBox(-0.2F, 0.2439F, -1.0113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.3533F, -1.4909F, 0.1222F, 0.0F, -0.2443F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(15, 61).mirror().addBox(-0.2F, -0.7F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.3533F, -1.4909F, -0.5585F, 0.0F, -0.2443F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 59).mirror().addBox(-0.2F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.3533F, -1.4909F, -0.6109F, 0.0F, -0.2443F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(45, 36).addBox(-0.5734F, -0.1153F, -2.3641F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7032F, 0.7026F, -2.7941F, 1.1519F, 0.0F, 0.2443F));

		PartDefinition cube_r8 = main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(49, 32).addBox(-0.4274F, -0.4665F, -0.334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6537F, 0.2978F, -0.8169F, -0.4108F, -0.2086F, 0.3343F));

		PartDefinition cube_r9 = main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(65, 59).addBox(-0.8F, -0.2106F, -0.0896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, -0.3533F, -1.4909F, -0.576F, 0.0F, 0.2443F));

		PartDefinition cube_r10 = main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(18, 43).addBox(-0.8F, 0.2439F, -1.0113F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.2F, -0.3533F, -1.4909F, 0.1222F, 0.0F, 0.2443F));

		PartDefinition cube_r11 = main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(15, 61).addBox(-0.8F, -0.7F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.2F, -0.3533F, -1.4909F, -0.5585F, 0.0F, 0.2443F));

		PartDefinition cube_r12 = main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(20, 59).addBox(-0.8F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.2F, -0.3533F, -1.4909F, -0.6109F, 0.0F, 0.2443F));

		PartDefinition cube_r13 = main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(25, 59).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.1F, 1.1F, 0.48F, 0.0F, 0.0F));

		PartDefinition backLeftLeg = main.addOrReplaceChild("backLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1114F, 0.5363F, -1.6339F, -0.1745F, 0.0F, -0.1309F));

		PartDefinition cube_r14 = backLeftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(15, 56).addBox(-0.5F, -0.7F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2997F, 3.2554F, -0.2904F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r15 = backLeftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(30, 59).addBox(-0.5F, -3.4F, -0.1558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 56).addBox(-0.5F, -2.8F, -0.1558F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2997F, 2.7554F, -0.3904F, -0.0524F, 0.0F, 0.0F));

		PartDefinition backLeftLeg2 = backLeftLeg.addOrReplaceChild("backLeftLeg2", CubeListBuilder.create().texOffs(9, 48).addBox(0.0431F, -0.4064F, -0.415F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 49).addBox(-0.6069F, -0.4064F, -0.415F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0464F, 5.5022F, 0.5442F, 1.1558F, -0.0181F, 0.1193F));

		PartDefinition backLeftLeg3 = backLeftLeg2.addOrReplaceChild("backLeftLeg3", CubeListBuilder.create().texOffs(5, 56).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1931F, 5.3866F, 0.3901F, -1.0036F, 0.0F, 0.0F));

		PartDefinition backLeftLeg4 = backLeftLeg3.addOrReplaceChild("backLeftLeg4", CubeListBuilder.create().texOffs(49, 4).addBox(-1.0F, -0.3027F, -1.561F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.5939F, 0.0386F, 0.5498F, 0.0F, 0.0F));

		PartDefinition backRightLeg = main.addOrReplaceChild("backRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1114F, 0.5363F, -1.6339F, 0.0436F, 0.0F, 0.1309F));

		PartDefinition cube_r16 = backRightLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(15, 56).mirror().addBox(-0.5F, -0.7F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2997F, 3.2554F, -0.2904F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r17 = backRightLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(30, 59).mirror().addBox(-0.5F, -3.4F, -0.1558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 56).mirror().addBox(-0.5F, -2.8F, -0.1558F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2997F, 2.7554F, -0.3904F, -0.0524F, 0.0F, 0.0F));

		PartDefinition backRightLeg2 = backRightLeg.addOrReplaceChild("backRightLeg2", CubeListBuilder.create().texOffs(9, 48).mirror().addBox(-1.0431F, -0.4064F, -0.415F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 49).mirror().addBox(-0.3931F, -0.4064F, -0.415F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0464F, 5.5022F, 0.5442F, 1.1994F, 0.0181F, -0.1193F));

		PartDefinition backRightLeg3 = backRightLeg2.addOrReplaceChild("backRightLeg3", CubeListBuilder.create().texOffs(5, 56).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1931F, 5.3866F, 0.3901F, -0.48F, 0.0F, 0.0F));

		PartDefinition backRightLeg4 = backRightLeg3.addOrReplaceChild("backRightLeg4", CubeListBuilder.create().texOffs(49, 4).mirror().addBox(-1.0F, -0.3027F, -1.561F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5939F, 0.0386F, 0.8988F, 0.0F, 0.0F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(19, 11).addBox(-0.5F, -0.6034F, -0.2224F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, -0.425F, 1.4F, -0.0318F, 0.0771F, -0.1369F));

		PartDefinition cube_r18 = tail.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(62, 56).addBox(-0.5F, 1.3F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(55, 62).addBox(-0.5F, 0.7F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(50, 62).addBox(-0.5F, 0.1F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(63, 48).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(45, 62).addBox(-0.5F, -0.4F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(58, 6).addBox(-0.5F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.3F, 1.07F, 1.3768F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(19, 20).addBox(-0.8F, -0.3F, -0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -0.6034F, -0.0224F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 29).addBox(-0.5F, -0.291F, -0.2129F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2801F, 6.552F, -0.0685F, -0.2231F, 0.0736F));

		PartDefinition cube_r20 = tail2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(63, 51).addBox(-0.5F, 1.5F, 4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 31).addBox(-0.5F, 1.1F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 63).addBox(-0.5F, 0.7F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 63).addBox(-0.5F, 0.2F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 6).addBox(-0.5F, -0.2F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 62).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.8187F, 0.2416F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r21 = tail2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 30).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.491F, -0.0129F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.4246F, -0.264F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.1162F, 6.5678F, 0.1963F, -0.3684F, -0.1224F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5174F, -0.1992F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1015F, 7.4871F, 0.0395F, -0.3167F, -0.1017F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -3.225F, 0.2395F, -0.2924F, -0.0995F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(36, 23).addBox(-2.5F, -1.8429F, -0.1969F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 3.2049F, -3.3528F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(34, 29).addBox(-2.5F, -4.41F, 0.0319F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0F, 5.1049F, -7.5528F, -0.1658F, 0.0F, 0.0F));

		PartDefinition body9_r1 = body.addOrReplaceChild("body9_r1", CubeListBuilder.create().texOffs(50, 59).mirror().addBox(-3.0779F, -0.9499F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(20, 56).mirror().addBox(-2.6779F, -0.9499F, -0.4803F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.337F, -5.1683F, 0.1253F, 0.2288F, -1.242F));

		PartDefinition body12_r1 = body.addOrReplaceChild("body12_r1", CubeListBuilder.create().texOffs(45, 59).mirror().addBox(-2.0779F, -0.9499F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(40, 59).mirror().addBox(-1.6779F, -0.9499F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.237F, -1.3683F, 0.0277F, -0.0974F, -1.3016F));

		PartDefinition body9_r2 = body.addOrReplaceChild("body9_r2", CubeListBuilder.create().texOffs(64, 43).mirror().addBox(-0.79F, -0.1884F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.237F, -1.3683F, -0.0627F, -0.0795F, -0.3552F));

		PartDefinition body10_r1 = body.addOrReplaceChild("body10_r1", CubeListBuilder.create().texOffs(61, 35).mirror().addBox(-1.3451F, -0.4447F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.237F, -1.3683F, -0.0248F, -0.0981F, -0.7754F));

		PartDefinition body8_r1 = body.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(15, 64).mirror().addBox(-0.79F, -0.1884F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.237F, -3.2683F, 0.1749F, 0.0082F, -0.3636F));

		PartDefinition body9_r3 = body.addOrReplaceChild("body9_r3", CubeListBuilder.create().texOffs(61, 28).mirror().addBox(-1.3451F, -0.4447F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.237F, -3.2683F, 0.1568F, 0.0783F, -0.777F));

		PartDefinition body10_r2 = body.addOrReplaceChild("body10_r2", CubeListBuilder.create().texOffs(56, 32).mirror().addBox(-2.6779F, -0.9499F, -0.4803F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.237F, -3.2683F, 0.0969F, 0.1461F, -1.2997F));

		PartDefinition body7_r1 = body.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(61, 22).mirror().addBox(-1.3451F, -0.4447F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.337F, -5.1683F, 0.2227F, 0.1359F, -0.7176F));

		PartDefinition body6_r1 = body.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(5, 64).mirror().addBox(-0.79F, -0.1884F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.337F, -5.1683F, 0.258F, 0.0348F, -0.3094F));

		PartDefinition body11_r1 = body.addOrReplaceChild("body11_r1", CubeListBuilder.create().texOffs(45, 59).addBox(1.0779F, -0.9499F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(40, 59).addBox(0.6779F, -0.9499F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.237F, -1.3683F, 0.0277F, 0.0974F, 1.3016F));

		PartDefinition body9_r4 = body.addOrReplaceChild("body9_r4", CubeListBuilder.create().texOffs(61, 35).addBox(0.3451F, -0.4447F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3F, -0.237F, -1.3683F, -0.0248F, 0.0981F, 0.7754F));

		PartDefinition body8_r2 = body.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(64, 43).addBox(-0.21F, -0.1884F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.237F, -1.3683F, -0.0627F, 0.0795F, 0.3552F));

		PartDefinition body9_r5 = body.addOrReplaceChild("body9_r5", CubeListBuilder.create().texOffs(56, 32).addBox(0.6779F, -0.9499F, -0.4803F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.237F, -3.2683F, 0.0969F, -0.1461F, 1.2997F));

		PartDefinition body8_r3 = body.addOrReplaceChild("body8_r3", CubeListBuilder.create().texOffs(61, 28).addBox(0.3451F, -0.4447F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3F, -0.237F, -3.2683F, 0.1568F, -0.0783F, 0.777F));

		PartDefinition body7_r2 = body.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(15, 64).addBox(-0.21F, -0.1884F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.237F, -3.2683F, 0.1749F, -0.0082F, 0.3636F));

		PartDefinition body5_r1 = body.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(5, 64).addBox(-0.21F, -0.1884F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.337F, -5.1683F, 0.258F, -0.0348F, 0.3094F));

		PartDefinition body6_r2 = body.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(61, 22).addBox(0.3451F, -0.4447F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3F, -0.337F, -5.1683F, 0.2227F, -0.1359F, 0.7176F));

		PartDefinition body8_r4 = body.addOrReplaceChild("body8_r4", CubeListBuilder.create().texOffs(50, 59).addBox(2.0779F, -0.9499F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(20, 56).addBox(0.6779F, -0.9499F, -0.4803F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.337F, -5.1683F, 0.1253F, -0.2288F, 1.242F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(21, 0).addBox(-1.8F, -0.2678F, -0.2053F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.0F, -0.8951F, -6.4528F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 21).addBox(-1.5F, -0.6064F, 0.6633F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0F, -0.1951F, -7.3528F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1968F, -6.479F, -0.2252F, -0.1181F, 0.0714F));

		PartDefinition body10_r3 = body2.addOrReplaceChild("body10_r3", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(-1.9451F, -0.4447F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(40, 62).mirror().addBox(-1.3451F, -0.4447F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.5598F, -2.3894F, 0.3127F, 0.7889F, -1.2599F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(14, 52).mirror().addBox(-1.0F, -1.0F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.6995F, -2.0127F, 1.3106F, 0.1796F, 0.3999F));

		PartDefinition body8_r5 = body2.addOrReplaceChild("body8_r5", CubeListBuilder.create().texOffs(30, 65).mirror().addBox(-0.79F, -0.1884F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.5598F, -2.3894F, 0.6279F, 0.5945F, -0.7738F));

		PartDefinition body6_r3 = body2.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-0.79F, -0.1884F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0402F, -0.5894F, 0.4431F, 0.0881F, -0.3847F));

		PartDefinition body7_r3 = body2.addOrReplaceChild("body7_r3", CubeListBuilder.create().texOffs(30, 62).mirror().addBox(-1.3451F, -0.4447F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0402F, -0.5894F, 0.3752F, 0.2569F, -0.7744F));

		PartDefinition body8_r6 = body2.addOrReplaceChild("body8_r6", CubeListBuilder.create().texOffs(34, 56).mirror().addBox(-2.6779F, -0.9499F, -0.4803F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0402F, -0.5894F, 0.1973F, 0.4085F, -1.3061F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(61, 16).mirror().addBox(-0.5F, -0.7225F, -0.705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.1713F, -1.5319F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(18, 47).mirror().addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.1287F, -1.8319F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(61, 16).addBox(-0.5F, -0.7225F, -0.705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.2F, -0.1713F, -1.5319F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(14, 52).addBox(-1.0F, -1.0F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 2.6995F, -2.0127F, 1.3106F, -0.1796F, -0.3999F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(18, 47).addBox(-0.5F, -0.5F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, 1.1287F, -1.8319F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(38, 0).addBox(-0.8F, -0.2351F, -0.3149F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0052F, -3.5307F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(34, 36).addBox(-0.5F, -0.8F, 0.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.4052F, -4.3307F, 0.2443F, 0.0F, 0.0F));

		PartDefinition body9_r6 = body2.addOrReplaceChild("body9_r6", CubeListBuilder.create().texOffs(40, 62).addBox(0.9451F, -0.4447F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(40, 62).addBox(0.3451F, -0.4447F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3F, 0.5598F, -2.3894F, 0.3127F, -0.7889F, 1.2599F));

		PartDefinition body7_r4 = body2.addOrReplaceChild("body7_r4", CubeListBuilder.create().texOffs(30, 65).addBox(-0.21F, -0.1884F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, 0.5598F, -2.3894F, 0.6279F, -0.5945F, 0.7738F));

		PartDefinition body7_r5 = body2.addOrReplaceChild("body7_r5", CubeListBuilder.create().texOffs(34, 56).addBox(0.6779F, -0.9499F, -0.4803F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.0402F, -0.5894F, 0.1973F, -0.4085F, 1.3061F));

		PartDefinition body6_r4 = body2.addOrReplaceChild("body6_r4", CubeListBuilder.create().texOffs(30, 62).addBox(0.3451F, -0.4447F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3F, -0.0402F, -0.5894F, 0.3752F, -0.2569F, 0.7744F));

		PartDefinition body5_r2 = body2.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(65, 0).addBox(-0.21F, -0.1884F, -0.4803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.0402F, -0.5894F, 0.4431F, -0.0881F, 0.3847F));

		PartDefinition frontLeftLeg = body2.addOrReplaceChild("frontLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3954F, 2.3012F, -2.0491F, -0.0814F, -0.1706F, -0.056F));

		PartDefinition cube_r34 = frontLeftLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(35, 59).addBox(-0.2F, 0.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 26).addBox(-0.5F, -2.8F, 1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4309F, 2.5591F, -1.5565F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r35 = frontLeftLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1959F, 0.7745F, -0.0565F, 0.2618F, 0.0F, -0.1309F));

		PartDefinition frontLeftLeg2 = frontLeftLeg.addOrReplaceChild("frontLeftLeg2", CubeListBuilder.create().texOffs(49, 12).addBox(-0.1429F, -0.1492F, -0.5044F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(49, 19).addBox(-0.7429F, -0.1492F, -0.5044F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5471F, 3.4215F, 0.118F, -1.0469F, 0.0664F, 0.0462F));

		PartDefinition frontLeftLeg3 = frontLeftLeg2.addOrReplaceChild("frontLeftLeg3", CubeListBuilder.create().texOffs(54, 45).addBox(-0.497F, -0.1085F, -0.3045F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.04F, 4.5479F, -0.2442F, 0.4282F, -0.0079F, -0.0112F));

		PartDefinition frontLeftLeg4 = frontLeftLeg3.addOrReplaceChild("frontLeftLeg4", CubeListBuilder.create().texOffs(49, 0).addBox(-1.0F, -0.3F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0157F, 2.391F, 0.2084F, 1.423F, -0.0223F, -0.0068F));

		PartDefinition frontRightLeg = body2.addOrReplaceChild("frontRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3954F, 2.3012F, -2.0491F, 0.3561F, -0.0468F, 0.0737F));

		PartDefinition cube_r36 = frontRightLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(35, 59).mirror().addBox(-0.8F, 0.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 26).mirror().addBox(-0.5F, -2.8F, 1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4309F, 2.5591F, -1.5565F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r37 = frontRightLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1959F, 0.7745F, -0.0565F, 0.2618F, 0.0F, 0.1309F));

		PartDefinition frontRightLeg2 = frontRightLeg.addOrReplaceChild("frontRightLeg2", CubeListBuilder.create().texOffs(49, 12).mirror().addBox(-0.8571F, -0.1492F, -0.5044F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(49, 19).mirror().addBox(-0.2571F, -0.1492F, -0.5044F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5471F, 3.4215F, 0.118F, -1.3088F, -0.0674F, -0.0446F));

		PartDefinition frontRightLeg3 = frontRightLeg2.addOrReplaceChild("frontRightLeg3", CubeListBuilder.create().texOffs(54, 45).mirror().addBox(-0.503F, -0.1085F, -0.3045F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.04F, 4.5479F, -0.2442F, 0.4669F, -0.0001F, 0.0839F));

		PartDefinition frontRightLeg4 = frontRightLeg3.addOrReplaceChild("frontRightLeg4", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-1.0F, -0.3F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0157F, 2.391F, 0.2084F, 0.9867F, 0.0223F, 0.0068F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7911F, -3.4403F, -0.1907F, -0.3053F, -0.0083F));

		PartDefinition cube_r38 = neck.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(27, 47).addBox(-1.3F, -0.2536F, -0.2012F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5F, -1.0178F, -2.4449F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r39 = neck.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(26, 42).addBox(-1.0F, -0.2513F, -0.2535F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5F, -0.4178F, -2.4449F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1141F, -2.5261F, -0.2954F, -0.4606F, -0.1773F));

		PartDefinition cube_r40 = neck2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 39).addBox(-1.3F, -0.2448F, -2.5625F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.9037F, 0.0312F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r41 = neck2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(17, 38).addBox(-1.0F, -0.1039F, 0.1057F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.1037F, -2.6688F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(54, 36).addBox(-0.5F, -0.6231F, -1.8018F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4795F, -1.9514F, 0.2184F, 0.0416F, 0.0131F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(55, 56).addBox(-1.0F, -0.2743F, -0.1938F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7095F, -0.2994F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(50, 65).mirror().addBox(-0.2F, -0.2622F, -1.3879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(45, 65).mirror().addBox(-0.2F, -0.2622F, -0.7879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.9231F, -2.4018F, 0.0087F, -0.3092F, 0.0564F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(65, 62).mirror().addBox(-0.4F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 65).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9864F, 0.2428F, -0.2919F, -1.1454F, 1.3149F, -0.5998F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(66, 24).mirror().addBox(-0.4479F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3821F, 0.1325F, -0.8188F, -0.4131F, 0.7096F, -0.2291F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(-0.2597F, -0.2122F, -0.1757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6803F, -0.2231F, -1.3496F, -0.0258F, -0.0224F, -0.0535F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(66, 21).mirror().addBox(-0.1835F, -1.0408F, 0.8619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(54, 24).mirror().addBox(-0.1835F, -0.5408F, -0.1381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2803F, 0.0769F, -2.9496F, -0.0177F, -0.28F, -0.009F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(20, 66).mirror().addBox(-0.1718F, -0.7702F, -0.0772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9803F, 0.2769F, -3.5496F, -0.0359F, -0.4347F, 0.0186F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(9, 43).mirror().addBox(-0.8F, -0.5F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 59).mirror().addBox(-0.81F, -0.4862F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1964F, -2.3028F, -0.055F, -0.3137F, 0.017F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(42, 52).mirror().addBox(-0.2F, -0.6866F, -1.1998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1769F, -3.5518F, -0.1007F, -0.3778F, 0.07F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(36, 47).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0231F, -6.4518F, -0.0213F, -0.2062F, 0.0369F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(65, 65).mirror().addBox(-0.51F, -0.2895F, -0.1965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(65, 65).addBox(-0.49F, -0.2895F, -0.1965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(49, 52).addBox(-0.5F, -0.3F, -0.2965F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.2231F, -6.4518F, 0.1693F, 0.0F, 0.0F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(26, 38).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(9, 39).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(61, 13).mirror().addBox(-0.63F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(61, 10).mirror().addBox(-0.52F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.5169F, -2.5866F, -0.124F, -0.2652F, 0.4699F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(48, 56).mirror().addBox(-0.1931F, -0.2205F, -0.8138F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.9095F, -0.8994F, -0.0743F, -0.3938F, 0.0924F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-0.2F, -0.2144F, -0.1642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.9095F, -0.8994F, -0.2197F, 0.3898F, -0.0151F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(56, 50).mirror().addBox(-0.1931F, -0.2205F, -1.4138F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.9095F, -0.8994F, -0.0671F, -0.395F, 0.0736F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(58, 3).mirror().addBox(-0.2F, -0.1019F, -0.1514F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.9095F, -0.3994F, -0.2621F, 0.6731F, -0.1182F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(55, 65).mirror().addBox(-1.0F, -0.2231F, -0.1642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 65).addBox(0.2F, -0.2231F, -0.1642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(56, 53).addBox(-0.9F, -0.2144F, -0.1642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, -0.9095F, -0.8994F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(60, 40).mirror().addBox(-1.0F, -0.2231F, -0.7642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 40).addBox(0.2F, -0.2231F, -0.7642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 8).addBox(-0.9F, -0.2144F, -1.7642F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, -0.9095F, -0.8994F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(58, 0).addBox(-1.8F, -0.2144F, -0.1642F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.9095F, -0.8994F, -0.2197F, -0.3898F, 0.0151F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(58, 3).addBox(-1.8F, -0.1019F, -0.1514F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, -0.9095F, -0.3994F, -0.2621F, -0.6731F, 0.1182F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(9, 39).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(61, 13).addBox(-0.37F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(61, 10).addBox(-0.48F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(26, 38).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.6F, -0.5169F, -2.5866F, -0.124F, 0.2652F, -0.4699F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(55, 59).addBox(-0.19F, -0.4862F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(9, 43).addBox(-0.2F, -0.5F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, -0.1964F, -2.3028F, -0.055F, 0.3137F, -0.017F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(56, 50).addBox(-1.8069F, -0.2205F, -1.4138F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.9095F, -0.8994F, -0.0671F, 0.395F, -0.0736F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(48, 56).addBox(-1.8069F, -0.2205F, -0.8138F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.9095F, -0.8994F, -0.0743F, 0.3938F, -0.0924F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(40, 65).addBox(-0.5F, -0.187F, -0.7366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5231F, -5.0018F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(28, 52).addBox(-0.5F, -0.243F, -1.788F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, -0.9231F, -3.5018F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(45, 65).addBox(-0.8F, -0.2622F, -0.7879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(50, 65).addBox(-0.8F, -0.2622F, -1.3879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, -0.9231F, -2.4018F, 0.0087F, 0.3092F, -0.0564F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(65, 38).addBox(-0.5F, -0.2622F, -1.2879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(35, 65).addBox(-0.5F, -0.2622F, -0.7879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.9231F, -2.4018F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(65, 62).addBox(-0.6F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 65).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9864F, 0.2428F, -0.2919F, -1.1454F, -1.3149F, 0.5998F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(66, 24).addBox(-0.5521F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3821F, 0.1325F, -0.8188F, -0.4131F, -0.7096F, 0.2291F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(66, 18).addBox(-0.7403F, -0.2122F, -0.1757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6803F, -0.2231F, -1.3496F, -0.0258F, 0.0224F, 0.0535F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(20, 66).addBox(-0.8282F, -0.7702F, -0.0772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9803F, 0.2769F, -3.5496F, -0.0359F, 0.4347F, -0.0186F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(66, 21).addBox(-0.8165F, -1.0408F, 0.8619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 24).addBox(-0.8165F, -0.5408F, -0.1381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2803F, 0.0769F, -2.9496F, -0.0177F, 0.28F, 0.009F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(45, 47).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2518F, 0.1768F, -5.2842F, -0.0911F, -0.2062F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(54, 20).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6511F, 0.2149F, -3.6252F, 0.0541F, -0.3243F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(54, 20).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6511F, 0.2149F, -3.6252F, 0.0541F, 0.3243F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(42, 52).addBox(-0.8F, -0.6866F, -1.1998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 0.1769F, -3.5518F, -0.1007F, 0.3778F, -0.07F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(45, 47).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2518F, 0.1768F, -5.2842F, -0.0911F, 0.2062F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(36, 47).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.0231F, -6.4518F, -0.0213F, 0.2062F, -0.0369F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3769F, -0.1018F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r81 = jaw.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(54, 28).mirror().addBox(-0.5F, -0.4F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1436F, -1.1481F, 0.0F, 0.1396F, 0.0F));

		PartDefinition cube_r82 = jaw.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(53, 41).mirror().addBox(-0.3F, -0.6676F, -0.3075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5803F, 0.6436F, -2.1459F, 0.1649F, -0.2103F, 0.0452F));

		PartDefinition cube_r83 = jaw.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(54, 16).mirror().addBox(-0.3487F, -0.3249F, -1.6854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.7803F, 0.0436F, -0.8459F, 0.0467F, -0.2087F, 0.03F));

		PartDefinition cube_r84 = jaw.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(66, 9).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(66, 12).mirror().addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.5158F, 0.3212F, -1.7061F, -0.0096F, -0.1929F, 0.045F));

		PartDefinition cube_r85 = jaw.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(66, 15).mirror().addBox(-0.7459F, -0.4567F, 0.4961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7941F, 0.3141F, -3.0134F, 0.0497F, -0.4005F, 0.0204F));

		PartDefinition cube_r86 = jaw.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-0.6833F, -0.4567F, -0.5039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7941F, 0.3141F, -3.0134F, 0.049F, -0.3656F, 0.0222F));

		PartDefinition cube_r87 = jaw.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(35, 52).mirror().addBox(-0.2775F, -0.7209F, -0.306F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0803F, 0.5436F, -3.4459F, -0.1276F, -0.383F, 0.0282F));

		PartDefinition cube_r88 = jaw.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(60, 59).mirror().addBox(-0.2802F, -0.5F, -0.4252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 61).mirror().addBox(-0.2802F, -0.5F, -0.0252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.3436F, -3.8481F, 0.0F, -0.5061F, 0.0F));

		PartDefinition cube_r89 = jaw.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(5, 61).mirror().addBox(-0.2802F, -0.5005F, -0.4113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(10, 61).mirror().addBox(-0.2802F, -0.5005F, 0.1887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.1436F, -3.8481F, -0.0524F, -0.5061F, 0.0F));

		PartDefinition cube_r90 = jaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(54, 28).addBox(-0.5F, -0.4F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6F, 0.1436F, -1.1481F, 0.0F, -0.1396F, 0.0F));

		PartDefinition cube_r91 = jaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 61).addBox(-0.7198F, -0.5F, -0.0252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(60, 59).addBox(-0.7198F, -0.5F, -0.4252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8F, 0.3436F, -3.8481F, 0.0F, 0.5061F, 0.0F));

		PartDefinition cube_r92 = jaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(10, 61).addBox(-0.7198F, -0.5005F, 0.1887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 61).addBox(-0.7198F, -0.5005F, -0.4113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.8F, 0.1436F, -3.8481F, -0.0524F, 0.5061F, 0.0F));

		PartDefinition cube_r93 = jaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(35, 42).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3436F, -6.1481F, 0.0F, -0.2443F, 0.0F));

		PartDefinition cube_r94 = jaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.5F, -0.6F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3436F, -6.1481F, 0.0349F, -0.2443F, 0.0F));

		PartDefinition cube_r95 = jaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -0.6F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 0.3436F, -6.1481F, 0.0349F, 0.2443F, 0.0F));

		PartDefinition cube_r96 = jaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(35, 42).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, 0.3436F, -6.1481F, 0.0F, 0.2443F, 0.0F));

		PartDefinition cube_r97 = jaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(54, 16).addBox(-0.6513F, -0.3249F, -1.6854F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.7803F, 0.0436F, -0.8459F, 0.0467F, 0.2087F, -0.03F));

		PartDefinition cube_r98 = jaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(66, 15).addBox(-0.2541F, -0.4567F, 0.4961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7941F, 0.3141F, -3.0134F, 0.0497F, 0.4005F, -0.0204F));

		PartDefinition cube_r99 = jaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(54, 12).addBox(-0.3167F, -0.4567F, -0.5039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7941F, 0.3141F, -3.0134F, 0.049F, 0.3656F, -0.0222F));

		PartDefinition cube_r100 = jaw.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(66, 12).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(66, 9).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.5158F, 0.3212F, -1.7061F, -0.0096F, 0.1929F, -0.045F));

		PartDefinition cube_r101 = jaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(53, 41).addBox(-0.7F, -0.6676F, -0.3075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5803F, 0.6436F, -2.1459F, 0.1649F, 0.2103F, -0.0452F));

		PartDefinition cube_r102 = jaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(35, 52).addBox(-0.7225F, -0.7209F, -0.306F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0803F, 0.5436F, -3.4459F, -0.1276F, 0.383F, -0.0282F));

		return LayerDefinition.create(meshdefinition, 72, 72);
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